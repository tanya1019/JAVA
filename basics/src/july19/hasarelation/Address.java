package july19.hasarelation;

public class Address {

	String dorrName;
	String streetName;
	String city;
	Integer pinCode;
	
	

//	----------------------------Constructors-----------------------------
	
	
	public Address() {
		
	}
	
public Address(String dorrName, String streetName, String city, Integer pinCode) {
		super();
		this.dorrName = dorrName;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}


//	----------------------------getters and setters-----------------------------
public String getDorrName() {
		return dorrName;
	}


	public void setDorrName(String dorrName) {
		this.dorrName = dorrName;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getPinCode() {
		return pinCode;
	}


	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}


//	---------------------------toString--------------------------------------
	@Override
	public String toString() {
		return "Address [dorrName=" + dorrName + ", streetName=" + streetName + ", city=" + city + ", pinCode="
				+ pinCode + "]";
	}

}
