import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PassingCarsTest {
	
	int A[];
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}

	@Test
	public void testDefault() {
		A = new int[5];
		A[0] = 0;
		A[1] = 1;
		A[2] = 0;
		A[3] = 1;
		A[4] = 1;
		
		assertEquals(5, solution.solution(A));
	}
	
	@Test
	public void testConsecutiveZeroes() {
		A = new int[6];
		A[0] = 0;
		A[1] = 0;
		A[2] = 0;
		A[3] = 1;
		A[4] = 1;
		A[5] = 1;
		
		assertEquals(9, solution.solution(A));
	}
	
	@Test
	public void testSingleElement(){
		A = new int[6];
		A[0] = 0;
		assertEquals(0, solution.solution(A));
	}

}
