package org.chats;

import java.util.ArrayList;

import org.user.User;

public abstract class Conversation {
	
	protected ArrayList<User>  participants = new ArrayList<>();
	protected int conversationId;
	protected ArrayList<Message> messages = new ArrayList<>();
	
	
	public ArrayList<Message> getAllMessages(){
		return messages;
	}
	
	public void addMessage(Message message) {
		messages.add(message);
	}
	
	public int getConversationId() {
		return this.conversationId;
	}
	
	public String getMessage() {
		return "";
	}
	
}
