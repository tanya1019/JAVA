package com.spring.demo;

public class Employee { //POJO

	Integer id;
	String name;
	Double salary;
	Address address;
	Adhaar adhaar;
	
	public void init() {
		this.id = 1;
		this.name = "Bajaj";
	}
	
	//-----------default constructors-----------------
	public Employee() {
		super();
	}

	//--------------Parameterized constructor-----------------
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	


	public Employee(Integer id, String name, Double salary, Address address) {
		super();
		System.out.println("Constructor Injection"); //if it usses constructor to set the values then it is called as constructor injection
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	

	public Employee(Integer id, String name, Double salary, Address address, Adhaar adhaar) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.adhaar = adhaar;
	}

	//---------------Getters and Setters------------------
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter injection"); // setter injection if it usses setter to set the value
	}
	
	public Adhaar getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(Adhaar adhaar) {
		this.adhaar = adhaar;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", adhaar="
				+ adhaar + "]";
	}
	
	
	
	
}
