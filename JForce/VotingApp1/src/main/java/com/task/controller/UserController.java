package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.User;
import com.task.repository.UserRepository;
import com.task.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	UserService userser;
	
	@PostMapping("/addUser")
	public User createUser(@RequestBody User u1) {
		return userser.addUser(u1);
	}
}

