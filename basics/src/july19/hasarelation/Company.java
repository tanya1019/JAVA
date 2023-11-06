package july19.hasarelation;

public class Company {

	Integer companyId;
	String companyName;
	Employee [] employee;
	Department [] departments;
	
	
//----------------------------constructor---------------------------------
	
	public Company() {
		
	}
	
public Company(Integer companyId, String companyName, Employee [] employee) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.employee = employee;
	}



//	--------------------------getters and setters------------------------
	
	

	public Integer getCompanyId() {
		return companyId;
	}



	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public Employee [] getEmployee() {
		return employee;
	}



	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}



//	-----------------------------toString--------------------------------
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", employee=" + employee + "]";
	}
	
	

}
