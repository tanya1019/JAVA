package july18;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//student user defined data type
		Student student1 = new Student();
		System.out.println(student1);
		
		Student student2 = new Student(1, 100, "Tanya", "9145439916");
		System.out.println(student2);
		
		
		
		String name = student2.getName();
		System.out.println(name);
		
		student2.setName("Tanisha");
		System.out.println(student2);
		
		
		// array of employess
		Student []students = new Student[10]; // allocate the array in stack
		students[0] = new Student(1, 100, "student1", "1234567890");
		students[1] = new Student(2, 101, "student2", "9876543210");
		students[5] = new Student(5, 106, "student5", "4534544322");
		students[8] = new Student(8, 109, "student8", "1234555555");
		
		// print the students from the array
		for(Student studentRef : students) {
			System.out.println("--->" + studentRef);
		}
		
		

	}

}
