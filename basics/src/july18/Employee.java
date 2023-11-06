package july18;


import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee {

	Integer id;
	String name;
	String address;
	String email;
	String phone;
	LocalDate bDate;
	String deptName;
	Float salary;
	LocalDate doj;
	
	
//------------------Getters and Setters--------------------------
	
	
	public LocalDate getCurrentDate() {
		return doj;
	}




	public void setCurrentDate(LocalDate currentDate) {
		this.doj = currentDate;
	}




	public Float getSalary() {
		return salary;
	}




	public void setSalary(Float salary) {
		this.salary = salary;
	}


	
	
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




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public LocalDate getbDate() {
		return bDate;
	}




	public void setbDate(LocalDate bDate) {
		this.bDate = bDate;
	}




	public String getDeptName() {
		return deptName;
	}




	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

// -------------------constructor-------------------

	
	// default constructor
	Employee() {
		
	};

	public Employee(Integer id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}




	public Employee(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	


	public Employee(Integer id, String name, Float salary, LocalDate currentDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = currentDate;
	}

	
	public Employee(Integer id, String name, LocalDate bDate, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.bDate = bDate;
		this.salary = salary;
	}


// --------------------hash and equals method-----------------------






	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

//--------------------------toString------------------------------

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + ", bDate=" + bDate + ", deptName=" + deptName + ", salary=" + salary + ", currentDate="
				+ doj + "]";
	}

}
