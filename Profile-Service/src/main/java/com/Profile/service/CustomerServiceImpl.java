package com.Profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Profile.repo.CustomerRepo;
import com.commons.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	CustomerRepo customerRepo;
	

	@Override
	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}
	

}
