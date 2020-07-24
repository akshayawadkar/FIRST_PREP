package org.chats;

import org.user.User;

public class PrivateChat extends Conversation{

	
	public PrivateChat(User user1, User user2) {
		participants.add(user1);
		participants.add(user2);
		
	}
	
	
	
	
}
