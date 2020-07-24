package org.piece;

import org.board.Board;
import org.board.Box;

public class Bishop extends Piece{

	public Bishop(boolean isWhite) {
		super(isWhite);
		 
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(start.getPiece().getisWhite() == end.getPiece().isWhite) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		
		if(x == y) {
			return true;
		}
		
		return false;
	}

}
