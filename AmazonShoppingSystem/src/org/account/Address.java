package org.account;

public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
	
	public Address(String addressLine1, String addressLine2, String city, String state, String zipcode,
			String country) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}
	
	
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getCountry() {
		return country;
	}
	
	
	
	
	
	
}
