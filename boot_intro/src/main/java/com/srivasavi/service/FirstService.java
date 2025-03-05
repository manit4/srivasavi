package com.srivasavi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivasavi.dto.User;
import com.srivasavi.repository.FirstRepository;

@Service
public class FirstService {
	
	@Autowired
	FirstRepository firstRepository;

	public FirstService() {
		System.out.println("inside FirstService no-arg constructor...");
		
	}
	
	public void register(User user) throws Exception {
		
		firstRepository.saveUser(user);
	}
	
	public User findUser(String userId) throws Exception {
		
		User user = firstRepository.findUserById(userId);
		
		return user;
	}
	
	

}
