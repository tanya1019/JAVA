package com.spring.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarJavaBased {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Car carService = (Car) context2.getBean("car");
		System.out.println(carService.getMake());
		System.out.println(carService.getModel());
		System.out.println(carService.getYear());
		
		

	}

}
