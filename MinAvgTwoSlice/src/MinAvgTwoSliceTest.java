import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MinAvgTwoSliceTest {
	
int A[];
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}

	@Test
	public void testDefault() {
		A = new int[7];
		A[0] = 4;
		A[1] = 2;
		A[2] = 2;
		A[3] = 5;
		A[4] = 1;
		A[5] = 5;
		A[6] = 8;
		assertEquals(1, solution.solution(A));
	}
	
	@Test
	public void testTwoElements() {
		A = new int[2];
		A[0] = 4;
		A[1] = 2;
		assertEquals(0, solution.solution(A));
	}

}
