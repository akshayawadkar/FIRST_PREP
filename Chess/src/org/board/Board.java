package org.board;

import org.piece.*;

public class Board {

	static Box[][] chess;
	
	
	public Board(){
		 
	}
	
	public void initializeBoard() {
		chess = new Box[8][8];
		
//		chess[0][0] = new Box(0, 0, new Rook(true));
//		chess[0][1] = new Box(0, 1, new Knight(true));
//		
		
	}

	public static Box[][] getChess() {
		return chess;
	}

	public static void setChess(Box[][] chess) {
		Board.chess = chess;
	}
	
	
	
}
