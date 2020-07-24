import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shoe {

	List<BlackjackCard> cards;
	int numOfDecks;
	
	
	
	
	public Shoe(int numberOfDecks) {
		this.numOfDecks = numberOfDecks;
		createShoe();
		shuffle();
	}
	
	public void createShoe() {
	
		this.cards = new ArrayList<>();
		for(int decks = 0; decks < numOfDecks; decks++) {
			cards.add((BlackjackCard) new Deck().getCards());
		}
		
	}
	
	public void shuffle() {
	
		int cardCount = cards.size();
		Random r = new Random();
		for(int i = 0; i < cardCount; i++) {
			int index = r.nextInt(cardCount - i - 1);
			swap(i, index);
		}
		
	}
	
	public void swap(int i, int j) {
		
		Collections.swap(cards, i, j);
		
	}
	
	
	public BlackjackCard dealcard() {
		if(cards.size() == 0) {
			createShoe();
		}
		
		return cards.remove(0);
	}
	
}
