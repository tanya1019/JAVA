package com.spring.demo;

public class Address {
	
	Integer doornumber;
	String street;
	String city;
	
	public Address() {
		super();
	}

	public Address(Integer doornumber, String street, String city) {
		super();
		this.doornumber = doornumber;
		this.street = street;
		this.city = city;
	}

	public Integer getDoornumber() {
		return doornumber;
	}

	public void setDoornumber(Integer doornumber) {
		this.doornumber = doornumber;
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

	@Override
	public String toString() {
		return "Address [doornumber=" + doornumber + ", street=" + street + ", city=" + city + "]";
	}
	

}
