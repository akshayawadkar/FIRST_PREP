package org.account;

import java.util.List;

import org.constants.AccountStatus;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.payment.Card;
import org.product.Product;

public class Account {

	private String userName;
	private String password;
	private AccountStatus status;
	private String name;
	private String emailId;
	private String phone;
	private Address address;
	
	private List<Card> creditCards;
	private List<Card> debitCards;
	
	public boolean addProduct(Product product) {
		return false;
	}
	public boolean addProductReview(Product product) {
		return false;
	}
	
	
}

