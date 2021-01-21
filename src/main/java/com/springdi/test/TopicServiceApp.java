package com.springdi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdi.services.TopicService;

public class TopicServiceApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		TopicService ts = context.getBean("topicService", TopicService.class);

		for (String s : ts.getTopics()) {
			System.out.println(s);
		}
		context.close();

	}

}
