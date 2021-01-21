package com.springdi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdi.services.ServiceOne;

public class ServiceOneTwoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		ServiceOne so = context.getBean("serviceOne", ServiceOne.class);
		so.doIt();
		
		System.out.println(so);
		so = context.getBean("serviceOne", ServiceOne.class);
		
		 so.doIt();
		 System.out.println(so);
		context.close();
		context.registerShutdownHook();
	}

}
