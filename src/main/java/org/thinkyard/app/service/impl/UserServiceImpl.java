package org.thinkyard.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thinkyard.app.mapper.UserMapper;
import org.thinkyard.app.repository.UserRepository;
import org.thinkyard.app.service.UserService;
import org.thinkyard.app.wrapper.UserWrapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserWrapper> getUsers() {
		return userMapper.mapToWrappers(userRepository.findAll());
	}

}
