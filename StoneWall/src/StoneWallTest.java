import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StoneWallTest {
	
	Solution solution;
	int[] H;
	
	@Before
	public void setUp(){
		solution = new Solution();
	}
	
	@Test
	public void testOne(){
		H = new int[1];
		assertEquals(1, solution.solution(H));
	}

	@Test
	public void testDefault() {
		H = new int[9];
		H[0] = 8;
		H[1] = 8;
		H[2] = 5;
		H[3] = 7;
		H[4] = 9;
		H[5] = 8;
		H[6] = 7;
		H[7] = 4;
		H[8] = 8;
		assertEquals(7, solution.solution(H));
	}

}
