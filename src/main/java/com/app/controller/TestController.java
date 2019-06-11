/**
 * 
 */
package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Users;
import com.app.service.UserServiceImpl;

/**
 * @author pentayya.u
 *
 */
@RestController
public class TestController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping("/saveUser/{name}")
	public int saveusers(@PathVariable(value = "name") String name) {
		System.out.println("name ::" + name);
		return userServiceImpl.save(name);
	}

	@GetMapping("/findAll")
	public List<Users> fetchAllusers() {
		return null;
	}

}
