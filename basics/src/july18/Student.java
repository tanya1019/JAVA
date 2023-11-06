package july18;

import java.util.Date;

public class Student implements Comparable<Student> {

	
	// instance data members
	Integer id;
	Integer rollNumber;
	String name;
	Date dob;
	String address;
	String phone;
	String email;
	private String password;
	Float fees;
	Float cgpa;
	String gender;
	Integer feeDiscount;
	
	
	
	
	
	// ------------------------getters and setters---------------------
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		gender = gender;
	}

	public Integer getFeeDiscount() {
		return feeDiscount;
	}

	public void setFeeDiscount(Integer feeDiscount) {
		this.feeDiscount = feeDiscount;
	}

	// -------------------------default constructor------------------------
	Student() {
		
		this.fees = 5000.0f;
		
	}
	
	
	//---------------------- parameterised constructors-------------------
	public Student(Integer id, Integer rollNumber, String name, String phone ) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.name = name;
		this.phone = phone;
		
	}

	//-----------------------------fees and cgpa--------------------------
	public Student(Integer id, Integer rollNumber, String name, Float fees, Float cgpa,Integer feeDiscount, String gender) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.name = name;
		this.fees = fees;
		this.cgpa = cgpa;
		this.feeDiscount = feeDiscount;
		this.gender = gender;
		
	}

	
	
	
	
// ------------------------toString-----------------------------

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNumber=" + rollNumber + ", name=" + name + ", dob=" + dob + ", address="
				+ address + ", phone=" + phone + ", email=" + email + ", password=" + password + ", fees=" + fees
				+ ", cgpa=" + cgpa + ", gender=" + gender + ", feeDiscount=" + feeDiscount + "]";
	}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.getId().compareTo(o.getId());
}


	

}








