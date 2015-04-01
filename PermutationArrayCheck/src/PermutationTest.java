import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PermutationTest {
	
	int A[];
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}

	@Test
	public void testDefaultTrue() {
		A=new int[4];
		A[0] = 4;
		A[1] = 1;
		A[2] = 3;			    
	    A[3] = 2;
		assertEquals(1,solution.solution(A));	    
	}
	
	@Test
	public void testDefaultFalse() {
		A=new int[3];
		A[0] = 4;
	    A[1] = 1;
	    A[2] = 3;
	    assertEquals(0,solution.solution(A));
	}

}
