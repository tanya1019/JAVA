package july19.modifiers.p1;

public class ParentDriver {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		
//		parent.display();
		
		Child child = new Child();
//		child.display2();
		
//		child.data = 200;
//		
//		parent.display();
//		child.display();
//		child.display2();
//		
		
		
		parent.email = "tanisha@gmail.com";
		child.display();
		parent.display();
		child.email = "akanksha@gmail.com";
		parent.salary = 2000.0;
		parent.display();
		
		parent.display();
		child.display2();
		
//		parent.secret = "tanisha"    --> cannot do this 
		
		
	}

}
