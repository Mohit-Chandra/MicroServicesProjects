package com.Profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Profile.service.CustomerService;
import com.commons.model.Customer;

@RestController
@RequestMapping(value="/services")
public class ProfileController {
	
	
	@Autowired
	CustomerService customerService;
	
	public Customer save(@RequestBody Customer customer ) {
		
		return customerService.save(customer);
		
	}

}
