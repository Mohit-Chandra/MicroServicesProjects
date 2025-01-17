package com.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Customer")
@Getter
@Setter
public class Customer {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String firstName;
	
	private String lastName;
	
	private String dlNumber;
	private String zipCode;
	

}
