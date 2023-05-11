package com.Springpro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springpro.User;
import com.Springpro.Repository.UserRepository;
import com.Springpro.Service.UserService;



@RestController
public class UserController {
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	UserService userser;
	
	@PostMapping("/addUser")
	public User createUser(@RequestBody User u1) {
		 PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		 String s1 = passwordEncoder.encode(u1.getPassword());
		 System.out.println(s1);
		 u1.setPassword(passwordEncoder.encode(u1.getPassword()));
		 return userser.addUser(u1);
		
	}
	
//	@PostMapping(path= "/addUser", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
//	public String createUser(@RequestBody User u1) {
//		return "home.jsp";
//		
//	}
}

