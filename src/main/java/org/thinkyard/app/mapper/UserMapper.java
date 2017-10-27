package org.thinkyard.app.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thinkyard.app.model.User;
import org.thinkyard.app.wrapper.UserWrapper;

@Component
public class UserMapper {

	@Autowired
	private ModelMapper modelMapper;

	public UserWrapper mapToWrapper(User entity) {
		return modelMapper.map(entity, UserWrapper.class);
	}

	public User mapToEntity(UserWrapper wrapper) {
		return modelMapper.map(wrapper, User.class);
	}

	public List<UserWrapper> mapToWrappers(List<User> entities) {
		return entities.stream().map(user -> mapToWrapper(user)).collect(Collectors.toList());
	}

	public List<User> mapToEntities(List<UserWrapper> wrappers) {
		return wrappers.stream().map(userWrapper -> mapToEntity(userWrapper)).collect(Collectors.toList());
	}
}
