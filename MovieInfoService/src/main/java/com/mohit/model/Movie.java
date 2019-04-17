package com.mohit.model;

public class Movie {
	private String name;
	private String rating;
	public Movie() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Movie(String name, String rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	
	
	
}
