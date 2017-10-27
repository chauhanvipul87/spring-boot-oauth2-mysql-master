package org.thinkyard.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thinkyard.app.service.UserService;
import org.thinkyard.app.wrapper.UserWrapper;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/list/user", method = RequestMethod.GET)
	public List<UserWrapper> getAllUsers() {
		return userService.getUsers();
	}
}
