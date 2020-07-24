package org.user;

public abstract class Account {

	private Person person;
	private String username;
	private String password;
	private AccountStatus accountStatus;
	
	public boolean resetAccount();
	public boolean resetPassword();
	
}
