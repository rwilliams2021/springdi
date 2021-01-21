package com.springdi.services;

public class MessageService {
	private String msg1;
	private String msg2;

	public MessageService(String msg1, String msg2) {
		this.msg1 = msg1;
		this.msg2 = msg2;
	}

	public void printMessage() {
		System.out.println(msg1);
		System.out.println(msg2);

	}

}
