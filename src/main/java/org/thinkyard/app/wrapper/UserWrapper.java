package org.thinkyard.app.wrapper;

import java.util.List;

import lombok.Data;

@Data
public class UserWrapper {

	private String username;

	private String email;

	private String firstName;

	private String lastName;

	private List<RoleWrapper> roles;
}
