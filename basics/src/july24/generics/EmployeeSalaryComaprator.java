package july24.generics;

import java.util.Comparator;

import july18.Employee;

public class EmployeeSalaryComaprator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary().compareTo(o2.getSalary());
	}
	
	

}
