package org.thinkyard.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private ConsumerTokenServices tokenServices;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam(name = "name", required = false, defaultValue = "World!") String name) {
		return "Hello " + name;
	}

	@RequestMapping(path = "/logout")
	public void logout(@RequestHeader(value = "Authorization") String authorization) {
		if (!StringUtils.isEmpty(authorization) && authorization.contains("Bearer")) {
			String accessToken = authorization.substring("Bearer".length() + 1);
			tokenServices.revokeToken(accessToken);
		}
	}
}
