import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NumberOfDiscIntersectionsTest {
	
	Solution solution;
	
	int A[];
	
	@Before
	public void setUp(){
		solution = new Solution();
	}

	@Test
	public void testZero() {
		A = new int[0];
		assertEquals(0, solution.solution(A));
	}
	
	@Test
	public void testDefault() {
		A = new int[6];
		A[0] = 1;
		A[1] = 5;
		A[2] = 2;
		A[3] = 1;
		A[4] = 4;
		A[5] = 0;
		assertEquals(11, solution.solution(A));
	}

}
