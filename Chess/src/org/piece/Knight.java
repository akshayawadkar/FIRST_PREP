package org.piece;

import org.board.Board;
import org.board.Box;

public class Knight extends Piece{

	
	public Knight(boolean isWhite) {
		super(isWhite);
	}
	
	
	public boolean canMove(Board board, Box start, Box end) {
		
		if(start.getPiece().getisWhite() == end.getPiece().getisWhite()) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		
		return (x * y) == 2;
	}
}
