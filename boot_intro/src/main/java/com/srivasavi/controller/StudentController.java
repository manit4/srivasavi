package com.srivasavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivasavi.dto.Student;
import com.srivasavi.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public String register(@RequestBody Student student) {
		
		System.out.println(student.getStudentId()+", "+student.getName());
		
		studentService.create(student);
		
		return "Registration Successful";
	}

}
