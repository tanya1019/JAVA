package com.spring.demo.javabased;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.demo.Employee;

@Configuration
public class BeanConfig {

	@Bean(initMethod = "init")
	@Scope("prototype")
	public Employee employee() {
		return new Employee();
	}
	
}
