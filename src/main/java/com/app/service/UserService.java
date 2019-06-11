package com.app.service;

import com.app.model.Users;

public interface UserService {

	int save(String name);

	Users findByUsername(String username);

	String findRole();

	String findLoginName();

}
