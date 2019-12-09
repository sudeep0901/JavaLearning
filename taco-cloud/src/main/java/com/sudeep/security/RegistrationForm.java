package com.sudeep.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {
	private String username;
	private String password;
	private String fullname;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String comments;

	public User toUser(PasswordEncoder passEncoder) {

		return new User(username, passEncoder.encode(password), fullname, street, city, state, zip, phone, comments);
	}
}
