package org.chats;

import org.user.User;

public class GroupChat extends Conversation{

	
	public void addParticipant(User user) {
		participants.add(user);
	}
	
	public void removeParticipant(User user) {
		participants.remove(user);
	}
	
}
