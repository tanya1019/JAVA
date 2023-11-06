package july18;

public class StudentAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student []studentData = new Student[5];
		studentData[0] = new Student(1, 100, "student1", 5000.0f, 7.1f, 6,"male");
		studentData[1] = new Student(2, 101, "student2", 5000.0f, 8.1f, 6,"female");
		studentData[2] = new Student(3, 102, "student3", 5000.0f, 7.1f, 6,"female");
		studentData[3] = new Student(4, 103, "student4", 5000.0f, 6.1f, 6,"male");
		studentData[4] = new Student(5, 104, "student5", 5000.0f, 9.1f, 6,"male");


		
		for(Student studentRef : studentData) {
			System.out.println(studentRef);
		};
		
	
	 
		
		
		for( Student stu : studentData) {
			
			String gender = stu.getGender();
			Float cgpa = stu.getCgpa();
			Float fees = stu.getFees();
			
			if (gender.equals("female")){
				if(cgpa > 7) {
					float a = fees - (fees*0.2f);
					fees = a - a*0.6f;
					
				}
				else if(cgpa > 8) {
					float b = fees - (fees*0.2f);
					fees = b - b*0.12f;
				}
				else if(cgpa > 9) {
					float c = fees - (fees*0.2f);
					fees = c - c*0.12f;
				}
			}
			else {
				if(cgpa > 7) {
					
					fees = fees - fees*0.6f;
					
				}
				else if(cgpa > 8) {
					
					fees = fees - fees*0.12f;
				}
				else if(cgpa > 9) {
					
					fees = fees - fees*0.12f;
				}
			}
			stu.setFees(fees);
			
		}
		
		for (Student studentUpdated : studentData) {
			System.out.println("--->" + studentUpdated);
		}
		// male data
		for (Student maleStudent : studentData) {
			String gender = maleStudent.getGender();
			Integer id = maleStudent.getId();
			Float fees = maleStudent.getFees();
			
			if(gender.equals("male")) {
				System.out.println("male are ---> " + id +"  " +  gender+ " "  + fees);
			}
			
		}
		
		// female
		for (Student femaleStudent : studentData) {
			String gender = femaleStudent.getGender();
			Integer id = femaleStudent.getId();
			Float fees = femaleStudent.getFees();
			
			if(gender.equals("female")) {
				System.out.println("Female are ---> " + id +"  " +  gender+ " "  + fees);
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
