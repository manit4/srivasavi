package com.srivasavi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivasavi.dto.Student;
import com.srivasavi.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public String register(@RequestBody @Valid Student student) {
		
		System.out.println(student.getStudentId()+", "+student.getName());
		
//		if( student.getPassword().length() < 9) {
//			return "Password length should not be less than 9";
//		}
//		
		studentService.create(student);
		
		return "Registration Successful";
	}
	
	@GetMapping("/allStudents")
	public List<Student> getAllStudents() {
		
		List<Student> students = studentService.allUsers();
		
		return students;
	}
	
	@DeleteMapping("deleteById/{studentId}")
	public String deleteStudent( @PathVariable String studentId ) {
		
		System.out.println(studentId);
		
		studentService.deleteById(studentId);
		
		return "Student deleted Successfully";
	}
	
	@DeleteMapping("deleteByPassword/{password}")
	public String deleteStudentByPassword( @PathVariable String password ) {
		
		System.out.println(password);
		
		studentService.deleteByPassword(password);
		
		return "Student deleted Successfully by password";
	}
	
	@GetMapping("/getByName/{name}")
	public List<Student> allUsers(@PathVariable String name) {
		
		System.out.println("the name is "+name);
		
		return studentService.allStudents(name);
	}
}
