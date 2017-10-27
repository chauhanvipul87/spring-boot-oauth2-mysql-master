package org.thinkyard.app.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.thinkyard.app.model.AppUserDetails;
import org.thinkyard.app.model.User;
import org.thinkyard.app.repository.UserRepository;
import org.thinkyard.app.service.AppUserDetailsService;

@Service
public class AppUserDetailsServiceImpl implements AppUserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (Objects.isNull(user)) {
			throw new UsernameNotFoundException("user not found");
		}
		return new AppUserDetails(user);
	}

}
