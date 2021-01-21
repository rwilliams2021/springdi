package com.springdi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdi.services.GreetingService;

public class GreetingServiceApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		GreetingService gs = context.getBean("greetingService", GreetingService.class);
		gs.greet();
		gs = context.getBean("greetingService", GreetingService.class);
		gs.greet();
		context.close();
		context.registerShutdownHook();

	}
}
