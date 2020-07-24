package org.cart;

import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public boolean addItem(Item item) {
		return false;
	}
	
	public boolean removeItem(Item item) {
		return false;
	}
	
	private boolean updateQuantinty(Item item, int count) {
		return true;
	}
	
	public List<Item> getItems(){
		return null;
	}
	
	public boolean checkout() {
		return false;
	}
	
	
	
	
	
	
}

