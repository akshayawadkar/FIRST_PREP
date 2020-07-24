package org.usermanager;

import java.util.*;

import org.user.User;

public class UserManager {

	
	private UserManager instance;
	
	protected Map<Integer, User> userById;
	protected Map<String, User> userByName;
	
	
	
	
	public UserManager getInstance() {
		if(instance == null) {
			instance = new UserManager();
		}
		
		return instance;
	}
	
	
	public void addUser(User from, User to) {
		
	}
	
	public boolean approveAddRequest(AddRequest request) {
		return true;
	}
	
	public void rejectAddRequest(AddRequest request) {
		
	}
	
	public void userSignedOn(String userName) {
		
		// can be used to log the infromation
		// primarily used to set the status of the user
		// online
		// offline
		
	}
	
	public void userSignedOff(String userName) {
		
	}
	
}
