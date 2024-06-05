package boradgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
		
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//retorna a matriz pieces rowXcolumn
	public Piece piece (int row, int column){
		return pieces [row][column];
	}
	
	//retorna a posição da peça
	public Piece pieces(Position position) {
		return pieces [position.getRow()][position.getColumn()];
	}
	//responsavel por colocar a peça no tabuleiro
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
