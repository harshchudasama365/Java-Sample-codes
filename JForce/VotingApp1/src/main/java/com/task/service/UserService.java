package com.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.entity.User;
import com.task.repository.UserRepository;

@Service
public class UserService  {
	
	@Autowired
	private UserRepository userrepo;
	
	@Transactional
	public User addUser(User u1) {
		return userrepo.save(u1);
	}
}
