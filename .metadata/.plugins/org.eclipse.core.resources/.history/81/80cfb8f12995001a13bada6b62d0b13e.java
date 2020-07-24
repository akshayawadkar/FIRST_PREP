package org.reservation;

public class Fine {

	private Date creationdate;
	private double bookItemBarcode;
	private String memberId;
	
	public static void collectFine(String memberId, long days);
	
}
