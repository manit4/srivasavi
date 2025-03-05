package com.srivasavi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfiguaration {
	
	public FirstConfiguaration() {
		System.out.println("inside FirstConfiguartion no-arg constructor...");
	}
	
	@Bean
	public Thread getThread() {
		
		System.out.println("inside getThread()");
		
		return new Thread();
	}

}
