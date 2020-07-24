
public class Test {
	
	public static void main(String[] args) {
		
		GameBoard game = new GameBoard(4);
		int start = 1;
		
		while(true) {
			
			String result = game.playGame(start);
			start++;
			
			if(!result.equals("")) {
				System.out.println(result);
				break;
			}
			
			if(start == game.getNoOfPlayer()) {
				start = 1;
			}
			
		}
		
	}

}
