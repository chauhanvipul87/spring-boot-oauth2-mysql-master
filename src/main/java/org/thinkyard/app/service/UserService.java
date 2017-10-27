package org.thinkyard.app.service;

import java.util.List;

import org.thinkyard.app.wrapper.UserWrapper;

public interface UserService {

	List<UserWrapper> getUsers();
}
