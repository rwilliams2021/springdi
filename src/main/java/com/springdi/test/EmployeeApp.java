package com.springdi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdi.services.Employee;

public class EmployeeApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Employee e1 = context.getBean("employee", Employee.class);
		e1.setName("John");
		e1.setEmail("john@gmail.com");
		
		Employee e2 = context.getBean("employee", Employee.class);
		e2.setName("Winston");
		e2.setEmail("winston@gmail.com");

		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
		System.out.println("--------------------------------");
		System.out.println(e2.getName());
		System.out.println(e2.getEmail());

		context.close();
		context.registerShutdownHook();

	}
}
