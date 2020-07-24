package org.user;
import java.util.*;

import org.chats.GroupChat;
import org.chats.PrivateChat;
import org.usermanager.AddRequest;

public class User {
	
	private String name;
	private String username;
	private int id;
	private UserStatus userStatus;
	private Map<Integer, User> friends;
	private Map<Integer, AddRequest> sentAddRequests;
	private Map<Integer, AddRequest> recivedAddRequest;
	
	private List<GroupChat> groupChats;
	private Map<Integer, PrivateChat> personalChats; 
	
	
	public User(String userName, int id, String name) {
		this.id = id;
		this.username = userName;
		this.name = name;
//		this.userStatus = 
		
		friends = new HashMap<>();
		sentAddRequests = new HashMap<>();
		recivedAddRequest = new HashMap<>();
		groupChats = new ArrayList<>();
		personalChats = new HashMap<>();
		
	}
	

	public void setStatus(UserStatus status) {
		this.userStatus = status;
	}
	
	public UserStatus getStatus() {
		return this.userStatus;
	}
	
	public String getUserName() {
		return username;
	}
	
	public String getName() {
		return name;
	}
	
	
	public boolean sendPrivateMessage(String msg, User to) {
		return true;
	}
	
	public boolean sendGroupMessage(String message, int groupId) {
		return true;
	}
	
	public void addConverstionRequest(PrivateChat converstaion) {
		
	}
	
	public void addConversationRequest(GroupChat conversation) {
		
	}
	
	
	public void requestAddUserByName(String userName) {
		
	}
	
	public void requestAddById(int userId) {
		
	}
	
	public void removeAddRequest(AddRequest request) {
		
		
	}
	
	public AddRequest getAddRequest(AddRequest request) {
		return null;
	}
	
	public List<AddRequest> getAllAddRequest(){
		return (List<AddRequest>) sentAddRequests.values();
	}
	
	
	public AddRequest getRecievedAddRequest() {
		return null;
	}
	public List<AddRequest> getAllRecieveAddRequest(){
		return null;
	}
	
	
	
	
	
}
