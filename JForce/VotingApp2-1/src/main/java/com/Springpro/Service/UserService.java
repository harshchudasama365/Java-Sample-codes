package com.Springpro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Springpro.User;
import com.Springpro.Repository.UserRepository;


@Service
public class UserService  {
	
	@Autowired
	private UserRepository userrepo;
	
	@Transactional
	public User addUser(User u1) {
		return userrepo.save(u1);
	}
}
