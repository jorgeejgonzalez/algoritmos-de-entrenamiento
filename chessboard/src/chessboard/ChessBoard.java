package chessboard;

public class ChessBoard {
	
	public static void drawChessBoard(int cols, int rows){		
		int board[][]=new int[rows][cols];
		
		for(int row=0;row<rows;++row){
			for(int col=0;col<cols;++col){
				if(row==0 && col==0)	{
					board[row][col]=0;
					continue;
				}
				if(row>0 && col==0){
					board[row][col] = board[row-1][col]==0 ? 1 : 0;
					continue;
				}
				
				board[row][col] = board[row][col-1]==0 ? 1 : 0;
				
			}
		}
		for(int row=0;row<rows;++row){
			for(int col=0;col<cols;++col){
				System.out.print(board[row][col]);
			}
			System.out.println("");
		}		
	}
	
	public static int getRows(final String inputData){
		String[] values = inputData.split(",");
		return Integer.parseInt(values[0]);
	}
	
	public static int getCols(final String inputData){
		String[] values = inputData.split(",");
		return Integer.parseInt(values[1]);
	}
	
	public static void main(String[] args) {
		String data="BMC_TEST_INPUT_MAGIC";
		
		drawChessBoard(getRows(data), getCols(data));
		
	}

}
