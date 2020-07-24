package org.piece;

import org.board.Board;
import org.board.Box;

public class Queen extends Piece{

	
	public Queen(boolean isWhite) {
		super(isWhite);
	}
	
	
	public boolean canMove(Board board, Box start, Box end) {
		return false;
	}
}
