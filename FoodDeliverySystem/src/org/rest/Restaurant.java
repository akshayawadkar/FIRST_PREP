package org.rest;

import java.util.List;

import org.cart.Order;
import org.user.Address;

public class Restaurant {

	
	private String restaurantId;
	private String restaurantName;
	private Address address;
	private Menu menu;
	private int ratings;
	
	private List<Order> orders;
	
	public void addItem(FoodProduct product, MenuSection section) {
		
	}
	
	public Order getOrderById(String id) {
		return null;
	}
	
	public List<Order> getAllOrders(){
		return orders;
	}
	
	public void addOrder(Order order) {
		
	}
	
}
