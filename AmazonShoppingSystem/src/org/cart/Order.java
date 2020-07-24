package org.cart;

import java.util.Date;
import java.util.List;

import org.payment.Payment;

public class Order {
 
	private double orderNumber;
	private Date orderCreate;
	private List<OrderLog> orderLogs;
	
	public boolean sendForShipment() {
		return false;
	}
	
	public boolean makePayment(Payment payment) {
		return false;
	}
	
	public boolean addOrderLog(OrderLog log) {
		return false;
	}
	
	
}
