package com.Profile.service;

import org.springframework.stereotype.Service;

import com.commons.model.Customer;


public interface CustomerService {
	
	Customer save(Customer customer);
}
