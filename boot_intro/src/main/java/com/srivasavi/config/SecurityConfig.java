package com.srivasavi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("first configure()");

		http.authorizeRequests()			
				//.antMatchers("/firstMessage", "/secondMessage", "/allUsers").permitAll()
				.antMatchers("/public/*").permitAll()
				.antMatchers("/student/*").hasRole("Admin")
				.anyRequest().authenticated().and().httpBasic();

	}

	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("configure()");
		auth.inMemoryAuthentication().withUser("xi").password(passwordEncoder().encode("123")).roles("Admin");
		auth.inMemoryAuthentication().withUser("jing").password(passwordEncoder().encode("234")).roles("Employee");

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("passwordEncoder()");
		return NoOpPasswordEncoder.getInstance();
	}

}
