package com.Profile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commons.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
}
