
public class BlackjackCard extends Card{

	
	
	int gameValue;
	
	public int getGameValue() {
		return this.gameValue;
	}
	
	
	
	BlackjackCard(int faceValue, Suit suit) {
		super(faceValue, suit);
		
		this.gameValue = faceValue;
		if(this.gameValue > 10) {
			this.gameValue = 10;
		}
		
	}

	
	
	
	
	
}
