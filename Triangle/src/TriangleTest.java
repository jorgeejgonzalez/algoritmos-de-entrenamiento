import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	
	int[] A;
	Solution solution;
	
	@Before
	public void setUp(){
		solution = new Solution();
	}
	
	@Test
	public void testLength(){
		A = new int[2];
		assertEquals(0, solution.solution(A));
	}

	@Test
	public void testDefaultOne() {
		A = new int[6];
		A[0] = 10;
		A[1] = 2;
		A[2] = 5;
		A[3] = 1;
		A[4] = 8;
		A[5] = 20;
		assertEquals(1, solution.solution(A));
	}
	
	@Test
	public void testDefaultZero() {
		A = new int[4];
		A[0] = 10;
		A[1] = 50;
		A[2] = 5;
		A[3] = 1;
		assertEquals(0, solution.solution(A));
	}

}
