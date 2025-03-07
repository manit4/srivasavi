package com.srivasavi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.srivasavi.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;

	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("first configure()");

		http.csrf().disable().cors().disable()
		.authorizeRequests()			
				//.antMatchers("/firstMessage", "/secondMessage", "/allUsers").permitAll()
				.antMatchers("/public/*", "/student/create").permitAll()
				.antMatchers("student/allStudents").hasRole("Employee")
				//.antMatchers("/student/*").hasRole("Admin")
				.anyRequest().authenticated().and().httpBasic();

	}

	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("configure()");
//		auth.inMemoryAuthentication().withUser("xi").password(passwordEncoder().encode("123")).roles("Admin");
//		auth.inMemoryAuthentication().withUser("jing").password(passwordEncoder().encode("234")).roles("Employee");

		auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
		
		
	}

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		System.out.println("passwordEncoder()");
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("passwordEncoder()");
		return new BCryptPasswordEncoder();
	}

}
