package org.cart;

import java.util.Date;
import java.util.List;

public class Order {

	private Date orderCreated;
	private OrderStatus orderStatus;
	private List<OrderLog> logs;
	
	
	public Payment payment() {
		return null;
	
	}
	
	public void sendForShiping() {
		
	}
	
	public void addLog(OrderLog log) {
		logs.add(log);
	}
	
	
}
