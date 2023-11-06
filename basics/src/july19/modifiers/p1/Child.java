package july19.modifiers.p1;

public class Child  extends Parent{

	
	
 
	public void display2() {
		System.out.println("Child --->" + super.data);
		System.out.println("Child --->" + super.email);
//		System.out.println("Child --->" + super.secret);   ---> this is also not possible
		System.out.println("Child --->" + super.salary);
	}
	
	

}
