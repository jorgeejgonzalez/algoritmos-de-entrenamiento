import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistinctTest {
	
	Solution solution;
	
	int[] A;
	
	@Before
	public void setUp(){
		solution = new Solution();
	}
	
	@Test
	public void testZero(){
		A = new int[0];
		assertEquals(0, solution.solution(A));
	}
	
	@Test
	public void testOne(){
		A = new int[1];
		A[0] = 1;
		assertEquals(1, solution.solution(A));
	}

	@Test
	public void testDefault() {
		A = new int[6];
		A[0] = 2;
		A[1] = 1;
		A[2] = 1;
		A[3] = 2;
		A[4] = 3;
		A[5] = 1;
		assertEquals(3, solution.solution(A));		
	}
	
	@Test
	public void testTwo() {
		A = new int[2];
		A[0] = -1000;
		A[1] = -1000;
		assertEquals(1, solution.solution(A));		
	}

}
