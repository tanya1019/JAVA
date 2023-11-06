package com.spring.demo;

public class Adhaar {
	Integer adhaarNumber;
//-------------------toString----------------
	@Override
	public String toString() {
		return "Adhaar [adhaarNumber=" + adhaarNumber + "]";
	}
//----------------getters setters--------------
	public Integer getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(Integer adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}
//-------------parameterized constructors-----------
	public Adhaar(Integer adhaarNumber) {
		super();
		this.adhaarNumber = adhaarNumber;
	}
//-----------------default constructors-------------
	public Adhaar() {
		super();
	}
	
}
