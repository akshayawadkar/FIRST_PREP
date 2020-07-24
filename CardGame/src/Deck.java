import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deck {

	public List<BlackjackCard> cards;
	Date creationDate;
	
	
	public Deck() {
		this.creationDate = new Date();
		
		this.cards = new ArrayList<>();
		
		for(int value = 1; value <= 13; value++) {
			for(Suit suit : Suit.values()) {
				cards.add(new BlackjackCard(value, suit));
			}
		}
		
		
	}
	
	
	public List<BlackjackCard> getCards(){
		return cards;
	}
	
	
	
}
