package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee empRef = (Employee) context.getBean("emp1");
		System.out.println(empRef);
		
		Employee empRef2 = (Employee) context.getBean("emp2");
		System.out.println(empRef2);
		
		System.out.println(context.getBean("emails"));
		System.out.println(context.getBean("emailsMap"));
		System.out.println(context.getBean("emailSet"));
		
		System.out.println(context.getBean("emp3"));
		
		System.out.println(context.getBean("emp4"));
		
		System.out.println(context.getBean("deptOne"));

	}

}
