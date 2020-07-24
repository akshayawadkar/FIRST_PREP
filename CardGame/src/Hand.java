import java.util.*;

public class Hand {

	
	List<BlackjackCard> cards;
	
	public Hand(BlackjackCard c1, BlackjackCard c2) {
		this.cards = new ArrayList<>();
		this.cards.add(c1);
		this.cards.add(c2);
	}
	
	public void addCard(BlackjackCard card) {
		cards.add(card);
	}
	
	
	public List<Integer> getScores(){
		List<Integer> totals = new ArrayList<>();
		totals.add(0);
		
		for(BlackjackCard card : cards) {
			List<Integer> newTotals = new ArrayList<>();
			for(int score : totals) {
				newTotals.add(card.faceValue + score);
				if(card.getFaceValue() == 1) {
					newTotals.add(11 + score);
				}
			}
			totals = newTotals;
					
		}
		
		return totals;
		
	}
	
	
	public int getHighestScore() {
		List<Integer> scores = getScores();
		int bestScore = 0;
		
		for(int score : scores) {
			if(score <= 21 && score > bestScore) {
				bestScore = score;
			}
		}
		
		
		return bestScore;
	}
	
	
	
}
