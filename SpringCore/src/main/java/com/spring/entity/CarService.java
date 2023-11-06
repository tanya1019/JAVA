package com.spring.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarService {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CarBean.xml");
		
		Car carRef = (Car) context.getBean("Car1");
		System.out.println(carRef);
		
	}
	
}
