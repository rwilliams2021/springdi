package com.springdi.services;

public abstract class ServiceOne {
		
	public abstract ServiceTwo getS2Intance() ;
	
	public void doIt() {
		System.out.println("this is serviceone...");
		ServiceTwo servicetwo = getS2Intance();
		System.out.println(servicetwo);
		servicetwo.doIt();
	}
}
