package com.srivasavi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class BootIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootIntroApplication.class, args);
	}

}
