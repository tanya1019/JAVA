package july24.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import july18.Employee;
import july18.Student;

public class CollectionDriver {

	public static void main(String[] args) {
		
		// in a list elements are in order
		//they are not sorted
		// it allows duplicates
		// allows null values
		
		// if you don't specify the generic type of the data types then it is by default object class
		
		List<Integer> intList = new ArrayList<>();
		intList.add(8);
		intList.add(4);
		intList.add(-1);
		intList.add(0);
		intList.add(8);
		intList.add(null);
		System.out.println("Integer List ----> " + intList);
		
		// to specify the index where you want to add element
		intList.add(1, 20);
		System.out.println("Integer List ----> " + intList);
		
		List<Integer> intList2 = new ArrayList<>();
		intList2.add(108);
		intList2.add(104);
		intList2.add(-101);
		intList2.add(100);
		intList2.add(108);
		System.out.println("Integer List2 ----> " + intList2);
		
		// add all will simply append at last
		intList.addAll(intList2);
		System.out.println("Integer List after add all -----> " + intList);
		
		// add list2 at specific version
		intList2.addAll(1, intList);
		System.out.println("Integer List2 adding all at particular index ----> " + intList2);
		
		List<Object> intList3 = new ArrayList<>();
		intList3.add(108);
		intList3.add(104);
		intList3.add(-101);
		intList3.add(100);
		intList3.add(108);
		System.out.println("Integer List2 ----> " + intList3);
		intList3.addAll(intList2);
//		intList2.addAll(intList3);   -----> type mismatch list3 is type object which is the super class and list2 is of class Integer
		 
		intList2.remove(0);
		System.out.println("remove ----> " + intList2);
		
		intList2.set(0, 30);
		System.out.println("set it will replace the value ----> " + intList2);
		
		System.out.println("size of the list ---> " + intList2.size());
		
		intList3.clear();
		System.out.println("the data will be lost ----> " + intList3);
		
		// sort
		List<Integer> intList4 = new ArrayList<>();
		intList4.add(108);
		intList4.add(104);
		intList4.add(-101);
		intList4.add(100);
		intList4.add(108);
		System.out.println("Before Sort ----> " + intList4);
		Collections.sort(intList4);
		System.out.println("After sorting ---> " +  intList4);
		
		//clone 
//		inttList4.clone();  ----> you cannot create a clone of wrapper objects only you can clone on user defined data type
		
		//contains
		System.out.println("contains ----> " + intList4.contains(108));
		System.out.println("contains ----> " + intList4.contains(111));
		
		// remove index
		System.out.println("remove ------> " + intList4.remove(1));
		
		Integer data = 108;
		intList4.remove(data);
		System.out.println("removing data ----> " +  intList4);
		
		System.out.println("add all -------> " + intList4.addAll(intList2));
		System.out.println(intList4);
		
		intList4.add(10);
		//remove all
		System.out.println("remove all ---->" + intList4.removeAll(intList2)); 
		System.out.println(intList4);
		
		System.out.println(intList4.retainAll(intList2));
		
		// retain all
		List <Integer> intList5 = new ArrayList<>();
		intList5.add(1);
		intList5.add(10);
		intList5.add(100);
		intList5.add(100);
		intList5.add(100);
		System.out.println(intList5);
		List <Integer> intList6 = new ArrayList<>();
		intList6.add(2);
		intList6.add(10);
		intList6.add(100);
		System.out.println(intList6);
		
		intList5.retainAll(intList6);
		System.out.println(intList5);
		
		
		for(Integer iterateVal : intList5) {
			System.out.println(iterateVal);
		}
		
		//sort by wrapper class
		
		List <String> employees = new ArrayList<>();
		employees.add("Tanya");
		employees.add("Akanksha");
		employees.add("Soniya");
		Collections.sort(employees);
		System.out.println(employees);
		
		
		// sort for user defined data type
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(4, 100, "Tanya", "915439916"));
		studentList.add(new Student(3, 200, "Akanksha", "914439916"));
		studentList.add(new Student(2, 300, "Soniya", "914554916"));
		studentList.add(new Student(1, 400, "Ankita", "914559916"));
		
		
		Collections.sort(studentList);
		System.out.println(studentList);
		
		Collections.sort(studentList, new StudentNameComparator());
		for(Student studRef : studentList) {
			System.out.println(studRef);
		}
	
		
	
		List<Employee> employeeList1 = new ArrayList<>();
		employeeList1.add(new Employee(1, "Tanya", 100.0f));
		employeeList1.add(new Employee(2, "Akanksha", 300.0f));
		employeeList1.add(new Employee(3, "Tanya", 50.0f));
		
		System.out.println("Before sort:"+employeeList1);
		Collections.sort(employeeList1, new EmployeeSalaryComaprator());
		
		for(Employee empRef : employeeList1) {
			System.out.println("----->" + empRef);
		}
		
		System.out.println(employeeList1.size());
		
		
		// add hash and equals method in employee
		
		Employee newEmp = new Employee(1, "Tanya", 100.0f);
		Employee newEmp1 = new Employee(1, "Tanya", 100.0f);
		
		employeeList1.add(newEmp1);
		
		
		System.out.println(employeeList1.contains(newEmp));
		
		for(Employee emp:employeeList1 ) {
			System.out.println(emp);
		}
		
		
		// Set
		// set element s are not ordered
		//set elements are not be sorted
		// the values will always be unique
		//to sort set of values convert set into the list and then use Collections.sort
		
		Set<Employee> employeeSet = new HashSet<>(employeeList1);
		
		for(Employee empSet : employeeSet) {
			System.out.println("------>" + empSet);
		}
		employeeSet.add(newEmp1);
		for(Employee empSet : employeeSet) {
			System.out.println("====>" + empSet);
		}
		
		Employee newEmp3 = new Employee(2, "Tanisha", 700.0f);
		employeeSet.add(newEmp3);
		for(Employee empSet : employeeSet) {
			System.out.println("=============>" + empSet);
		}
		
		
		
 		
		
		
		
		

		
	}

}
