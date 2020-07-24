package org.search;

import java.util.List;

import org.product.Product;

public interface Search {

	public List<Product> searchProductByName(String name);
	public List<Product> searchProductByCategory(String name);
	
		 
}
