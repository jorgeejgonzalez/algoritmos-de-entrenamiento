package chessboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class drawChessBoardTest {
	
	private ChessBoard chessBoard;
	
	@Before
	public void setUp(){
		chessBoard=new ChessBoard();
	}

	@Test
	public void test() {
		String data="100,2000";
		
		ChessBoard chessBoard=new ChessBoard();
		chessBoard.drawChessBoard(chessBoard.getRows(data), chessBoard.getCols(data));
	}

}
