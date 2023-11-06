package july24.generics;

import july18.Student;

public class GenericDriver {

	public static void main(String[] args) {
		
//		Box<int> intBox = new Box<>(100); // cannot use primitive data type because it requires size
		
		Box<Integer> integerBox = new Box<>(100);
		System.out.println(integerBox.getData());
		
		Box<String> stringBox = new Box<>("Bajaj");
		System.out.println(stringBox.getData());
		
		//you can add you user defined class
		Box<Student> studentBox = new Box<>(new Student(1, 100, "Tanya", "9145439916"));
		System.out.println(studentBox.getData());
 	}

}
