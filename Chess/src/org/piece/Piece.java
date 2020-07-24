package org.piece;

import org.board.Board;
import org.board.Box;

public abstract class Piece {

	
	 protected boolean isWhite = false;
	 protected boolean isKilled = false;
	 
	 public Piece(boolean isWhite) {
		 setisWhite(isWhite);
	 }
	 
	 public boolean getisWhite() {
		 return this.isWhite;
	 }
	 
	 public boolean getisKilled() {
		 return this.isKilled;
	 }
	 
	 public void setisWhite(boolean isWhite) {
		 this.isWhite = isWhite;
	 }
	 
	 public void setisKilled(boolean isKilled) {
		 this.isKilled = isKilled;
	 }
	 
	 public abstract boolean canMove(Board board, Box start, Box end);
}
