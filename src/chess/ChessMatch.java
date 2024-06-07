package chess;

import boradgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][]mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat [i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//metodo de iniciar a partida e colocar as peças
	private void initialSetup() {
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('a', 1, new King(board, Color.WHITE));

	}
	
}
