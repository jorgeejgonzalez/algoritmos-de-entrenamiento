import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MissingIntegerTest {
	
	int A[];
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}
	
	@Test
	public void testNegatives(){
		A=new int[2];
		A[0] = -1;
		A[1] = -3;				
		assertEquals(1, solution.solution(A));		 
	}

	@Test
	public void testDefault() {
		A=new int[6];
		A[0] = 1;
		A[1] = 3;
		A[2] = 6;
		A[3] = 4;
		A[4] = 1;
		A[5] = 2;		
		assertEquals(5, solution.solution(A));		 
	}
	
	@Test
	public void testLastChange() {
		A=new int[6];
		A[0] = 1;
		A[1] = 1;
		A[2] = 1;
		A[3] = 1;
		A[4] = 1;
		A[5] = 3;		
		assertEquals(2, solution.solution(A));		 
	}

}
