package org.game;

import org.board.Board;
import org.board.Box;
import org.piece.Piece;

public class Game {

	
	protected Player[] players;
	
	protected Board board;
	private Player currentTurn;
	
	private GameStatus status;
	
	public Game(){
		board = new Board();
	}
	
	
	public void initialize(Player p1, Player p2) {
		
		players[0] = p1;
		players[1] = p2;
		board.initializeBoard();
		
		if(p1.whiteSide) {
			this.currentTurn = p1;
		}else {
			this.currentTurn = p2;
		}
		
		
	}
	
	
	public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
		
		Box start = board.getChess()[startX][startY];
		Box end = board.getChess()[startY][endY];
		Piece sourcePiece = start.getPiece();
		Piece destPiece = end.getPiece();
		
		sourcePiece.canMove(board, start, end); 
		
		if(destPiece != null) {
			destPiece.setisKilled(true);
		}
		
		end.setPiece(sourcePiece);
		
		
		if(this.currentTurn == players[0]) {
			this.currentTurn = players[1];
		}else {
			this.currentTurn = players[0];
		}
		
		return true;
	}
}
