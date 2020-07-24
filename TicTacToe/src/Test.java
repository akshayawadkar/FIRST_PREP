
public class Test {

	
	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		
		Game game = new Game(3, p1, p2);
		 
		Player flag = p1;
		
		while(true) {
			
			// this will be take from the front end UI
			int result = game.move(1, 1, 1);
			if(result != 0) {
				System.out.println("Player won "+(result == 1 ? 'X' : 'O'));
				break;
			}else {
			
				if(flag == p1) {
					System.out.println("Now Playeing "+ "X");
					flag = p2;
				}else {
					System.out.println("Now Playeing "+ "Y");
					flag = p1;
				}
				
				
				
			}
			
		}
	}
	
}
