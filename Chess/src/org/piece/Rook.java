package org.piece;

import org.board.Board;
import org.board.Box;

public class Rook extends Piece{

	public Rook(boolean isWhite) {
		super(isWhite);
		 
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		 
		return false;
	}

}
