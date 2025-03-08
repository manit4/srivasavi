package com.srivasavi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srivasavi.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
