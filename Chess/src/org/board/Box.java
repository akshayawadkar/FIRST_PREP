package org.board;

import org.piece.Piece;

public class Box {

	protected Piece piece;
	protected int x;
	protected int y;
	
	
	public Box(int x, int y, Piece piece) {
		this.x = x;
		this.y = y;
		this.piece = piece;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Piece getPiece() {
		return this.piece;
	}

	public void setPiece(Piece sourcePiece) {
		 this.piece = sourcePiece;
		
	}
	
}
