package july19.modifiers.p2;

import july19.modifiers.p1.Parent;

public class Child extends Parent {
	
	static {
		System.out.println("this is package 2");
	}

	public void display3() {
		System.out.println("outside the package " + super.salary);
		
	}

}
