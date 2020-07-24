
public class Game {

	Board tictactoe;
	Player[] players;
	public Game(int dimension, Player p1, Player p2) {
		tictactoe = new Board(dimension);
		players[0] = p1;
		players[1] = p2;
		
	}
	
	public int move(int row, int col, int player) {
		
		tictactoe.place(row, col, player);
		int n = tictactoe.rows;
		
		boolean isWin = true;
		
		for(int i = 0; i < n; i++) {
			if(tictactoe.getPlayer(i, col) != player) {
				isWin = false;
				break;
			}
		}
		
		if(isWin) {
			return player;
		}
		
		
		isWin = true;
		
		for(int i = 0; i < n; i++) {
			if(tictactoe.getPlayer(row, i) != player) {
				isWin = false;
				break;
			}
		}
		
		if(isWin) {
			return player;
		}
		
		
		isWin = true;
		
		for(int i = 0; i < n; i++) {
			if(tictactoe.getPlayer(i, i) != player) {
				isWin = false;
				break;
			}
		}
		
		if(isWin) {
			return player;
		}
		
		
		isWin = true;
		
		for(int i = 0; i < n; i++) {
			if(tictactoe.getPlayer(i, n - i - 1) != player) {
				isWin = false;
				break;
			}
		}
		
		if(isWin) {
			return player;
		}
		return 0;
	}
}
