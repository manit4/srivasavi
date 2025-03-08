package com.srivasavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srivasavi.dto.User;
import com.srivasavi.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PutMapping("/update")
	public void updateUser(@RequestBody User user) {
		System.out.println("putMapping...");
		userRepository.save(user);
	}

}
