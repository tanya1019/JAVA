package july26.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import july18.Employee;
import july24.generics.EmployeeSalaryComaprator;

public class StreamDriver {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		nameList.add("tanya");
		nameList.add("akanksha");
		nameList.add("tanisha");
		nameList.add("Sakshi");
		nameList.add("Indra");
		
		nameList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));	
		
		nameList.stream().map(s -> s.toUpperCase()).forEach(a -> System.out.println(a));
		
		nameList.stream().map(s-> s.toLowerCase()).forEach(a -> System.out.println(a));
		
		Long nameCount = nameList.stream().map(s -> s.length()).filter(p -> p > 5).count();
		System.out.println("count is ----> " + nameCount);
		
		Optional<Integer> nameLenCount = nameList.stream().map(s -> s.length()).filter(p -> p < 5).reduce((a,b)-> a+b);
		if(nameLenCount.isPresent()) {
			System.out.println("Count of Employee is ---> " + nameLenCount.get());
		}
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(10, "Tanya", 50000.0f));
		employeeList.add(new Employee(20, "Akanksha", 40000.0f));
		employeeList.add(new Employee(30, "Tanisha", 55000.0f));
		employeeList.add(new Employee(40, "Soniya", 56000.0f));
		
		Stream<Employee> employeeFilter = employeeList.stream();
		employeeFilter.filter((e) -> e.getSalary() > 50000).forEach(s -> System.out.println(s));
//		employeeFilter.map((s) -> s.getName()).forEach(name -> System.out.println(name));  // cannot do this once it is terminated
		
//		now create a different variable for opening another stream
		Stream<Employee> employeeNames = employeeList.stream();
		employeeNames.map((s) -> s.getName()).forEach(name -> System.out.println(name)); 
		
//		now create a api for sum of all salary
		Optional<Float> employeeSumSalary = employeeList.stream().map(s -> s.getSalary()).reduce((a,b) -> a+b);
		
		System.out.println(employeeSumSalary.get());
		
		if(employeeSumSalary.isPresent()) {
			
			System.out.println(employeeSumSalary.get());
			
		}
		else {
			System.out.println("No salary of employee");
		}
		
//		find employee having highest salary
		
		Optional<Employee>	empMaxSalary =  employeeList.stream().max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
	
		if(empMaxSalary.isPresent()) {
			System.out.println("Max salary: "+ empMaxSalary.get());	
		}
		else {
			System.out.println("No salary of employee");
		}

		
//		2 employee having lowest salary	
		Comparator<Employee> employeeComparator = (e1,e2) -> e1.getSalary().compareTo(e2.getSalary());
		employeeList.stream().sorted(employeeComparator).limit(2).forEach(t -> System.out.println(t));
		
		 
//		 highest Salary for 2 employee\
		 employeeList.stream().sorted(employeeComparator.reversed()).limit(2).forEach(t -> System.out.println(t));
		 
//		 stream api for employee who joined this year
		 List<Employee> joiningDate = new ArrayList<>();
		 
		 joiningDate.add( new Employee(10, "Tanya", 100.0f, LocalDate.of(2021, 10, 20)));
		 joiningDate.add( new Employee(10, "Akanksha", 100.0f, LocalDate.of(2023, 9, 30)) );
		 joiningDate.add( new Employee(10, "Tanisha", 100.0f, LocalDate.of(2023, 8, 25)));
		 joiningDate.add( new Employee(10, "Soniya", 100.0f, LocalDate.of(2021, 11, 14)));
		 
		 int currentYear = LocalDate.now().getYear();
		 System.out.println(currentYear);
		 joiningDate.stream().filter(t -> t.getCurrentDate().getYear() == currentYear).forEach(m -> System.out.println(m));
		 
		 
		 // junior in the company
		 Comparator<Employee> employeeComparatorYear = (a1,a2) -> a1.getCurrentDate().compareTo(a2.getCurrentDate());
		 joiningDate.stream().sorted(employeeComparatorYear).limit(1).forEach(r -> System.out.println("Junior employee ----> " + r));	 
		 // senior in the company
		 joiningDate.stream().sorted(employeeComparatorYear.reversed()).limit(1).forEach(r -> System.out.println("Senior employee ----> " + r));
		
//		 oldest and the youngest employee
		 
		 List<Employee> dateOfBirth = new ArrayList<>();
		 
		dateOfBirth.add(new Employee(1, "Tanya", LocalDate.of(2001, 4, 19), 100.0f));
		dateOfBirth.add(new Employee(2, "Akanksha", LocalDate.of(2002, 4, 1), 200.0f));
		dateOfBirth.add(new Employee(3, "Soniya", LocalDate.of(2001, 3, 27), 300.0f));
		dateOfBirth.add(new Employee(4, "Sakshi", LocalDate.of(2001, 11, 20), 400.0f));
		 
		 System.out.println(dateOfBirth);
		 
		 Comparator<Employee> ageComparator = (a1,a2) -> a1.getbDate().compareTo(a2.getbDate());
//		 dateOfBirth.stream().sorted(ageComparator).limit(1).fo
	}

}
