package com.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
	

@RestController
public class Home {
	
	@GetMapping("/")
	public String homePage() {
		System.out.println("Home [page working");
		return "Home [page working";
	}

}
