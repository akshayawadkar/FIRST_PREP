package org.book;

import java.util.Date;

public class BookItem extends Book {

	private String barcode;
	private boolean isReferenceOnly;
	private Date borrowed;
	private Date dueDate;
	private double price;
	private Rack rack;
	
	public boolean checkout(String memberId) {
		
	}
}
