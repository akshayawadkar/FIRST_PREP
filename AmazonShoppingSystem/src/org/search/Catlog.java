package org.search;

import java.util.HashMap;
import java.util.List;

import org.product.Product;

public class Catlog implements Search{
	
	HashMap<String, List<Product>> productNames;
	HashMap<String, List<Product>> productCategories;
	

	@Override
	public List<Product> searchProductByName(String name) {
		 
		return productNames.get(name);
	}

	@Override
	public List<Product> searchProductByCategory(String name) {
		// TODO Auto-generated method stub
		return productNames.get(name);
	}

}
