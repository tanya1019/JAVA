package com.spring.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class BeanConfiguration {

	@Bean
	public Car car() {
		
		Car car = new Car();
		car.setId(1);
		car.setMake("Bmw");
		car.setModel("model1");
		car.setYear(2023);
		return car;
	}
	

	
}
