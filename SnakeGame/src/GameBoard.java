import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameBoard{
	
	private Random random;
	private int noOfPlayers;
	Map<Integer, Integer> ladders;
	Map<Integer, Integer> snakes;
	Map<Integer, Player> playerMap;
	
	public GameBoard(int numPlayers) {
		
		this.random = new Random();
		this.noOfPlayers = numPlayers;
		ladders = new HashMap<>();
		snakes = new HashMap<>();
		playerMap = new HashMap<>();
		
	}
	
	public int getNoOfPlayer() {
		return noOfPlayers;
	}
	
	private void constructLadderPosition() {
		ladders.put(3, 16);
		ladders.put(5, 7);
		ladders.put(15, 25);
		ladders.put(18, 20);
		ladders.put(21, 32);
	}
	
	
	private void constructSnakePostion() {
		snakes.put(12, 2);
		snakes.put(14, 11);
		snakes.put(17, 4);
		snakes.put(31, 19);
		snakes.put(35, 22);
	}
	
	public int setUpNoOfPlayers() {
		
		System.out.println("Total Players " +noOfPlayers);
		
		for(int i = 1; i <= noOfPlayers; i++) {
			Player player = new Player();
			player.playerName = "Player "+i;
			playerMap.put(i, player);
		}
		
		return noOfPlayers;
	}
	
	public String playGame(int currentPlayer) {
		
		
		Player player = playerMap.get(currentPlayer);
		
		player.oldPosition = player.currentPosition;
		
		int nextMove = random.nextInt(6) + 1;
		
		player.currentPosition = player.oldPosition + nextMove;
		
		Integer newLadderPosition = checkIfLadderExists(player, player.currentPosition);
		
		Integer newSnakePosition = checkIfSnakeExists(player, player.currentPosition);
		
		if(newLadderPosition != null && newSnakePosition != null) {
			System.out.println("Player "+currentPlayer+" moved by "+nextMove+"  positions");
		}
		
		if(player.currentPosition >= 100) {
			
			System.out.println("Player "+player +"  won");
			return player.playerName;
		}
		
		return "";

	}
	
	
	
	
	public Integer checkIfLadderExists(Player player, int currPosition) {
		Integer src = currPosition;
		Integer dest = ladders.get(src);
		
		if(dest != null) {
			player.currentPosition = dest;
		}
		
		return dest;
		
	}

	
	public Integer checkIfSnakeExists(Player player, int currPosition) {
		Integer src = currPosition;
		Integer dest = snakes.get(src);
		
		if(dest != null) {
			player.currentPosition = dest;
		}
		
		return dest;
	}
	

	
}