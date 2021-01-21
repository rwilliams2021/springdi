package com.springdi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdi.services.MessageService;

public class MessageServiceApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageService ms = context.getBean("messageService",MessageService.class);
		ms.printMessage();
	}

}
