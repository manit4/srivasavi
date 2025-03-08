package com.srivasavi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srivasavi.dto.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String>{

}
