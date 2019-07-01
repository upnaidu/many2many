package com.app.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Roles;
import com.app.model.Users;
import com.app.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public int save(String name) {

		Set<Users> usersSet = new HashSet<Users>();
		Set<Roles> rolesSet = new HashSet<Roles>();

		Users users = new Users();
		users.setUsername(name);
		users.setEmail("abcuser@gamil.com");
		users.setRoles(rolesSet);

		usersSet.add(users);

		Roles roles = new Roles();
		roles.setRolename("USER");
		roles.setRole("User");
		roles.setUsers(usersSet);

		rolesSet.add(roles);

		userRepository.save(users);

		return 0;
	}

	@Override
	public Users findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findLoginName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
