package com.spring.demo.annotations.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("annotionBeans");

	}

}
