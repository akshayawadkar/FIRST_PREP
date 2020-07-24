
public class Card {

	Suit suit;
	int faceValue;
	
	Card(int faceValue, Suit suit){
		this.faceValue = faceValue;
		this.suit = suit;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	
	
}
