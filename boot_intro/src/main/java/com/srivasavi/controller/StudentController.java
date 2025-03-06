package com.srivasavi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/allStudents")
	public List<Student> getAllStudents() {
		
		List<Student> students = studentService.allUsers();
		
		return students;
	}
}
