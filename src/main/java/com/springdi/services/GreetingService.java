package com.springdi.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class GreetingService implements ApplicationContextAware {
	private ApplicationContext context;

	public void setup() {
		System.out.println("init...GreetingService..");
	}

	public void destroy() {
		System.out.println("destroy...GreetingService..");
	}

	private String msg;

	public void greet() {

		System.out.println(msg);
		MessageService ms = context.getBean("messageService",MessageService.class);
		ms.printMessage();
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;

	}
}
