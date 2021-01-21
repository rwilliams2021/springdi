package com.springdi.services;

public class OrderService {
	private ShippingService shippingService;
	
	public void placeOrder() {
		System.out.println("Order Placed....");
		shippingService.initShipping();
	}

	public void setShippingService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

}


