import static org.junit.Assert.*;

import org.junit.Test;


public class MinesweeperTest {

	@Test
	public void testStringSplit() {
		String field="";
		field+="O O O O X O O O O O\n";
		field+="X X O O O O O O X O\n";
		field+="O O O O O O O O O O\n";
		field+="O O O O O O O O O O\n";
		field+="O O O O O X O O O O";
		
		String[][] splitted = MainClass.splitField(field);
		assertEquals("O", splitted[0][1]);
		assertEquals("X", splitted[1][0]);
	}
	
	@Test
	public void testSweepFieldSimple(){
		String[][] field= new String[2][2];
		field[0][0]="O";
		field[0][1]="O";
		field[1][0]="X";
		field[1][1]="X";
		
		String check=MainClass.sweepMines(field);
		assertEquals("2 2\nX X", check);		
	}
	
	

}
