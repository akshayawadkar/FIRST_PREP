package org.piece;

import org.board.Board;
import org.board.Box;

public class King extends Piece{

	
	public King(boolean isWhite) {
		
		super(isWhite);
		 
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(start.getPiece().getisWhite() == end.getPiece().getisWhite()) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getX() - end.getY());
		
		if(x + y == 1 && !isOccupied(end)) {
			return true;
		}
		
		if(x + y == 2 && !isOccupied(end)) {
			return true;
		}
		
		
		
		
		return false;
	}

	private boolean isOccupied(Box end) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
