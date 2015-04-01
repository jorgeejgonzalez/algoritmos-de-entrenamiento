import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TapeSplitTest {
	
	private Solution solution;
	
	private int A[];
	
	@Before
	public void setUp(){
		solution=new Solution();
	}
	

	@Test
	public void testDefault() {
		A=new int[5];
		A[0] = 3;
		A[1] = 1;
		A[2] = 2;
		A[3] = 4;
		A[4] = 3;
		assertEquals(1, solution.solution(A));
	}
	
	@Test
	public void testTwoElementsSmall(){
		A=new int[2];
		A[0]=7;
		A[1]=2;
		assertEquals(5, solution.solution(A));
	}
	
	@Test
	public void testTwoElementsSmallInverse(){
		A=new int[2];
		A[0]=2;
		A[1]=7;
		assertEquals(5, solution.solution(A));
	}
	
	@Test
	public void testTwoElementsBig(){
		A=new int[2];
		A[0]=-1000;
		A[1]=1000;
		assertEquals(2000, solution.solution(A));
	}
	
	@Test
	public void testTwoElementsBigZero(){
		A=new int[2];
		A[0]=-1000;
		A[1]=0;
		assertEquals(1000, solution.solution(A));
	}

}
