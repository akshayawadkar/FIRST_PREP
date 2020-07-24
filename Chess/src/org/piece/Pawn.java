package org.piece;

import org.board.Board;
import org.board.Box;

public class Pawn extends Piece{

	public Pawn(boolean isWhite) {
		super(isWhite);
		 
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(start.getPiece().getisWhite() == end.getPiece().getisWhite()) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		
		if(x + y == 1 && !boxIsNotOccupiedBySame(end) && !isBackWard(end)) {
			return true;
		}
		
		if(x + y == 2 && !boxIsNotOccupiedBySame(end) && !isBackWard(end)) {
			return true;
		}
		
		return false;
	}

	private boolean isBackWard(Box end) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean boxIsNotOccupiedBySame(Box end) {
		// TODO Auto-generated method stub
		return false;
	}

}
