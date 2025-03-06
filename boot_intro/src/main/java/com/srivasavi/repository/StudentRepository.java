package com.srivasavi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srivasavi.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
