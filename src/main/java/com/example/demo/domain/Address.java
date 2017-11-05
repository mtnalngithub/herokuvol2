package com.example.demo.domain;

public class Address {

	private Long id;
	private String street;
	private String city;
	
	public Address(){
		
	}
	
	public Address(Long id, String street, String city) {
		this.id = id;
		this.street = street;
		this.city = city;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
