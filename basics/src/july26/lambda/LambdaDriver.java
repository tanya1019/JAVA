package july26.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import july18.Employee;

public class LambdaDriver {

	public static void main(String[] args) {

		// lambda does not need a class
		
		
		demoInterface demoConsumer = () -> System.out.println("Welcome to Bajaj");
		demoConsumer.display();
		
		
		//built in Consumers functional interface
		// when you want to accept something
		Consumer<String> stringConsumer = (t) -> System.out.println(t);
		stringConsumer.accept("Bajaj Direct");
		
		BiConsumer<String, Integer> biConsumer = (s,t) -> System.out.println(s + t);
		biConsumer.accept("Bajaj" , 20); 
		
		// supplier
		Supplier<Double> piSupplier = () -> 3.14; // short hand for return 3.14
		System.out.println("Value of Pie is : " + piSupplier.get());
		
		
		//predicate
		// this will return a boolean value
		Predicate<Double> minSalalry = (p) -> p < 0;
		System.out.println(minSalalry.test(-100.0));
		
		
		//Function
		Function<Double, Double> sqrFunction = (a) -> a*a;
		System.out.println(sqrFunction.apply(5.0));
		
		
		// multiple line function
		Function<Integer, Integer> cubeFunction =  (b) -> {
			return b*b*b;
		};
		System.out.println(cubeFunction.apply(2));
		
//		create a lambda with appropriate functional interface to check whether the function is even or odd
		Predicate<Integer> evenOddFun = (e) -> {
			
			if(e%2 == 0) {
				return true;
				
			}
			else {
				return false;
			}		
			
		};
		Boolean b = evenOddFun.test(23);
		if(b) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");

		}
		
		
		// lambda function to convert a given string to lower or upper case
		Function<String, String> conversionFun  = (s) -> s.toLowerCase();
		System.out.println(conversionFun.apply("Tanya"));
		
		
		//modify employee salary by 10%
		Employee empRef = new Employee(1, "Tanya", 1000.0f);
		Float percentHike = 0.2f;
		Function<Employee, Float> employeeSalaryFun = (emp) -> {
			float oldSalary = emp.getSalary();
			emp.setSalary(oldSalary + oldSalary*percentHike);
			
			return emp.getSalary();
		};
		System.out.println(employeeSalaryFun.apply(empRef));
		System.out.println(empRef);
		
		
		// find given employee id is present in given map of employee or not
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(1, new Employee(1, "Tanya", 1000.0f));
		employeeMap.put(2, new Employee(2, "Akanksha", 2000.0f));
		
		BiPredicate<Integer, Map<Integer, Employee> > empPresent = (id, emp) -> emp.containsKey(id) ;
		System.out.println(empPresent.test(3, employeeMap));;
		
		
		
		
		
	}

}
