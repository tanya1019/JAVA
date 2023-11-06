package com.spring.demo.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.demo.Employee;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		System.out.println("first call" + emp.hashCode());
		
		emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		System.out.println("second call " + emp.hashCode());

	}

}
