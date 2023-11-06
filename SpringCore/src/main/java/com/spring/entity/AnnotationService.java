package com.spring.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationService {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Car carService = (Car) context3.getBean("car");
		System.out.println(carService.getMake());
		System.out.println(carService.getModel());
		System.out.println(carService.getYear());
	}

}
