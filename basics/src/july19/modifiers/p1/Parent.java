package july19.modifiers.p1;

public class Parent {


	public Integer data = 100;
	private String secret = "tanya";  
	String email = "tanya@gmail.com";   // default package protected
	protected Double salary = 4000.0;
	
	
	public void display() {
		System.out.println("public data-->" + data);
		System.out.println("secret data-->" + secret);
		System.out.println("email  data-->" + email);
		System.out.println("salary  data-->" + salary);
	}


	public String getSecret() {
		return secret;
	}


	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	
	
}
