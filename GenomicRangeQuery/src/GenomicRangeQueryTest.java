import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GenomicRangeQueryTest {
	
	Solution solution;
	
	String S;
	int[] P;
	int[] Q;
	
	@Before
	public void setUp(){
		solution = new Solution();
	}
	
	@Test
	public void testMinValue(){
		S="A";
		P = new int[1];
		Q = new int [1];
		
		P[0] = 0;
		Q[0] = 0;
		
		int[] r = solution.solution(S, P, Q);
		
		assertEquals(1, r[0]);
	}

	@Test
	public void testDefault() {		
		S="CAGCCTA";
		P = new int[3];
		Q = new int [3];
		
		P[0] = 2;    
		Q[0] = 4;
		P[1] = 5;
		Q[1] = 5;
		P[2] = 0;
		Q[2] = 6;
		
		int[] r = solution.solution(S, P, Q);
		
		assertEquals(2, r[0]);
		assertEquals(4, r[1]);
		assertEquals(1, r[2]);
		
	}	
	

}
