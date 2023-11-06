package july19.modifiers.p2;

import july19.modifiers.p1.Parent;

public class ParentDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Parent();
		parent.display();
//		parent.data= 1;
//		parent.display();
//		
		Child childData = new Child();
		childData.display3();
		
//		childData.salary = 1000.0; --> protected cannot modify in the parent class only accessible tho child class
		
//		parent.salary = 3000.0;  --> protected is not accessible outside the package
		
//		parent.email = "tanya@gmail.com"; // default access modifier cannot be accessible outside the package
		
//		parent.secret = 10;  ----> private access modifier cannot possible here outside the package

	}

}
