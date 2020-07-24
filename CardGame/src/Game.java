import java.util.List;

public class Game {

	
	Player player;
	Dealer dealer;
	Shoe shoe;
	
	int MAX_NUM_OF_DECKS = 3;
	
	
	public Game(Player palyer, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
		Shoe shoe = new Shoe(MAX_NUM_OF_DECKS);
	}
	
	public void start() {
//		player.placeBet(getBetFromUI);
		Hand playerHand = new Hand(shoe.dealcard(), shoe.dealcard());
		player.addHand(playerHand);
		
		Hand dealerrHand = new Hand(shoe.dealcard(), shoe.dealcard());
		dealer.addHand(playerHand);
		
		
		while(true) {
			List<Hand> hands = player.getAllHands();
			for(Hand hand : hands) {
				String action = "getUseraction(hand)";
				playAction(action, hand);
				if(action.equals("stand")) {
					break;
				}
			}
		}
		
		
		
		
	}

	public void playAction(String action, Hand hand) {
		 
		switch(action) {
		case "hit":
				hit(hand);
				break;
		case "split":
				split(hand);
				break;
				
		case "stand pat":
				break;
		case "stand":
				stand();
				break;
		default:
				System.out.println("Wrong input");
 		}
		
		
	}

	private void stand() {
		// TODO Auto-generated method stub
		
	}

	private void split(Hand hand) {
		// TODO Auto-generated method stub
		
	}

	private void hit(Hand hand) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
