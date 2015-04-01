import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FrogRiverOneTest {
	
	int A[];
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}

	@Test
	public void testDefault() {
		A = new int[8];
		A[0] = 1;
		A[1] = 3;
		A[2] = 1;
		A[3] = 4;
		A[4] = 2;
		A[5] = 3;
		A[6] = 5;
		A[7] = 4;		  
		assertEquals(6, solution.solution(5, A));
	}
	
	@Test
	public void testSingleElement(){
		A = new int[1];
		A[0] = 1;
		assertEquals(0, solution.solution(1, A));
	}
	
	@Test
	public void testDoubleElement(){
		A = new int[2];
		A[0] = 2;
		A[1] = 1;
		assertEquals(1, solution.solution(2, A));
	}
	
	@Test
	public void testDoubleElementFail(){
		A = new int[2];
		A[0] = 2;
		A[1] = 2;
		assertEquals(-1, solution.solution(2, A));
	}

}
