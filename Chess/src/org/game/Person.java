package org.game;


public class Person {

	
	private String name;
	private String email;
	private String userId;
	
	
	
	
	public Person(String name, String email, String userId) {
		super();
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
