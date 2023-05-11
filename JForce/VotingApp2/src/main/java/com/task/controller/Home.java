package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.User;
import com.task.repository.UserRepository;
import com.task.service.UserService;
	

@RestController
public class Home {
	
	@Autowired
	private UserRepository userrepo;
	
	@GetMapping("/")
	public String homePage() {
		System.out.println("Home [page working");
//		User ud = new User("fghj","ghj","fgh","ghj");
//		return userrepo.save(ud);
		return "welcome 123";
		
	}

}
