package com.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Vehicle")
@Getter
@Setter
public class Vehicle {
	
	@Id
	@GeneratedValue
	int id;
	String make;
	String model;
	String type;
	int year;

}
