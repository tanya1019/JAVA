package july19.hasarelation;

public class Employee {

	Integer id;
	String name;
	String phone;
	Address address;
	
	
	
//	----------------------------Constructors-----------------------------
	
	public Employee(Integer id, String name, String phone, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
//	----------------------------getters and setters-----------------------------
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



//	------------------------------------toString----------------------------------

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	

}
