package com.srivasavi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivasavi.dto.Student;
import com.srivasavi.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public void create(Student student) {
		
		studentRepository.save(student);
	}
	
	public List<Student> allUsers() {
		
		List<Student> students = studentRepository.findAll();
		
		return students;
	}
}
