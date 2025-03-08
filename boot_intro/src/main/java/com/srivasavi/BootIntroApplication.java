package com.srivasavi;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.srivasavi.dto.Address;
import com.srivasavi.dto.User;
import com.srivasavi.repository.AddressRepository;
import com.srivasavi.repository.UserRepository;

@SpringBootApplication
@CrossOrigin
public class BootIntroApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
//	@Autowired
//	AddressRepository addressRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(BootIntroApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		User user = new User("man", "123", "Manit", "a_001");
//		userRepository.save(user);
//		
//		Address address = new Address("a_001", "Delhi");
//		addressRepository.save(address);
		
//		User user = new User("man", "123", "Manit", null);
//		
//		Address address = new Address("a_001", "Hyderabad", user);
//		
//		user.setAddress(address);
//		
//		userRepository.save(user);
		
		
		User user = userRepository.findById("man").get();
		
		System.out.println(user.getUsername()+", "+user.getName()+", "+user.getPassword());
		
		Address address = user.getAddress();
		
		System.out.println(address.getCity());
		
	}
	

	

}
