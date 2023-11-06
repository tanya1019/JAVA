package com.spring.demo;

public class Department {
	Integer id;
	String deptName;
	Employee employee;
	
	// ------------default constructor-----------------
public Department() {
		super();
	}
//--------------parameterized Constructors------------
	public Department(Integer id, String deptName, Employee employee) {
	super();
	this.id = id;
	this.deptName = deptName;
	this.employee = employee;
}

	//	------------getters and setters------------
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
//	---------------toString---------------
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", employee=" + employee + "]";
	}
	
	
}
