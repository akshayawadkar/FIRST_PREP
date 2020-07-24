package org.usermanager;
import java.util.Date;

import org.user.User;

public class AddRequest {

	
	private User from;
	private User to;
	private Date date;
	private RequestStatus requestStatus;
	
	public AddRequest(User from, User to) {
		this.from = from;
		this.to = to;
		date = new Date();
	}
	
	public User getFromUser() {
		return from;
	}
	
	public User getToUser() {
		return to;
	}
	
	public Date getDate() {
		return date;
	}
	
	public RequestStatus getStatus() {
		return this.requestStatus;
	}
	
}
