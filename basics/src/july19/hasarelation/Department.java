package july19.hasarelation;

public class Department {

	String name;
	Integer managerId;
	//---------------------------constructors---------------------------
	public Department() {
		
	}
	
	public Department(String name, Integer managerId) {
		super();
		this.name = name;
		this.managerId = managerId;
	}
//---------------------------constructors---------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", managerId=" + managerId + "]";
	}

}
