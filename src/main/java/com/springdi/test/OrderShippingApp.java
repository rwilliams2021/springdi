package com.springdi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdi.services.OrderService;

public class OrderShippingApp {
public static void main(String[] args) {
	

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	
	OrderService os = context.getBean("orderService",OrderService.class);
	os.placeOrder();
	context.close();
	context.registerShutdownHook();
}
}
