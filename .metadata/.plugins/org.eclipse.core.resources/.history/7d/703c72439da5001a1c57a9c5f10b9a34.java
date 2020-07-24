
public class Cell {
	
	int row;
	int col;
	boolean isBomb;
	boolean isExposed;
	boolean isGuessed;
	int number;
	
	
	
	
	public Cell(int r, int c) {
		row = r;
		col = c;
	}
	
	public boolean flip() {
		isExposed = true;
		return !isBomb;
	}
	
	public boolean toogleGuess() {
		if(!isExposed) {
			isGuessed = !isGuessed;
		}
		
		return isGuessed;
	}
	
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public boolean isBomb() {
		return isBomb;
	}
	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
	}
	public boolean isExposed() {
		return isExposed;
	}
	public void setExposed(boolean isExposed) {
		this.isExposed = isExposed;
	}
	public boolean isGuessed() {
		return isGuessed;
	}
	public void setGuessed(boolean isGuessed) {
		this.isGuessed = isGuessed;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	 
	
	
	
	
	

}
