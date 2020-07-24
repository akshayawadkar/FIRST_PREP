
public class Board {

	
	int nrows;
	int ncols;
	int nbombs;
	Cell[][] cells;
	Cell[] bombs;
	int numUnExposed;
	
	public Board(int rows, int cols, int bombs) {
		this.nbombs = bombs;
		this.nrows = rows;
		this.ncols = cols;
		
		initializeBoard();
		shuffleBoard();
		setNumberedCells();
		
		numUnExposed = ncols * ncols - nbombs;
	}
	
}
