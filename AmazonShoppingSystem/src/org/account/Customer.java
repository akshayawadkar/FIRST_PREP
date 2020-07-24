package org.account;

import org.cart.*;

 

public abstract class Customer {
	
	private ShoppingCart cart;
	private Order order;
	
	public ShoppingCart getShoppingCart() {
		return null;
	}
	
	public boolean addItemToCard(Item item) {
		return false;
	}
	
	public boolean removeItemFromCart(Item item) {
		return false;
	}
	
	
	
}
