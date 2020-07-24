package org.game;

public class Player {

	protected Person person;
	protected boolean whiteSide = false;
	
	public Player(Person person, boolean whiteSide) {
		this.person = person;
		this.whiteSide = whiteSide;
	}
}
