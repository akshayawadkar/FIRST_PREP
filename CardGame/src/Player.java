import java.util.*;

abstract class BasePlayer {
	
	String id;
	String password;
	double balance;
	Person person;
	List<Hand> hands;
	
	public void resetPassword() {
		
	}
	
	
	public void addHand(Hand hand) {
		hands.add(hand);
	}

	public void removeHand(Hand hand) {
		hands.remove(hand);
	}
	
	public List<Hand> getAllHands(){
		return hands;
	}
	
	
	
	
}

public class Player extends BasePlayer{
	
	int bet;
	int totalCash;
	
	public Player(Hand hand) {
		this.hands = new ArrayList<>();
		this.hands.add(hand);
		
	}
	
}
