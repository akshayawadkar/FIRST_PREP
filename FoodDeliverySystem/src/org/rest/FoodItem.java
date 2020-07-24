package org.rest;

public class FoodItem {
	
	
	private FoodProduct food;
	private int quantity;
	private double price;
	
	public boolean updateQuantity(int quantity) {
		this.quantity = quantity;
		return true;
	}
	
	 

}
