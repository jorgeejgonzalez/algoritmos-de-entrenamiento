import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	Solution solution;
	int[] A;
	
	@Before
	public void setUp(){
		solution=new Solution();		
	}

	@Test
	public void testDefault() {
		A = new int[4];
		A[0] = 2;
		A[1] = 3;
		A[2] = 1;
		A[3] = 5;
		assertEquals(4, solution.solution(A));
	}
	
	@Test
	public void testMissingFirst() {
		A = new int[4];
		A[0] = 2;
		A[1] = 4;
		A[2] = 3;
		A[3] = 5;
		assertEquals(1, solution.solution(A));
	}
	
	@Test
	public void testMissingLast() {
		A = new int[4];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 5;
		assertEquals(4, solution.solution(A));
	}
	
	@Test
	public void testStartOverOne() {
		A = new int[4];
		A[0] = 6;
		A[1] = 7;
		A[2] = 9;
		A[3] = 10;
		assertEquals(8, solution.solution(A));
	}
	
	
	@Test
	public void testLargeMissingFirst() {
		A = new int[100000];
		int c=100000;
		for(int i=0; i<100000;++i){
			A[i]=c;
			--c;			
		}
		A[99999]=2;
		assertEquals(1, solution.solution(A));
	}
	
	@Test
	public void testLargeMissingLast() {
		A = new int[100000];		
		for(int i=0; i<100000;++i){
			A[i]=i+1;			
		}
		A[99999]=100001;
		assertEquals(100000, solution.solution(A));
	}
	
	@Test
	public void testLargeMissingMiddle() {
		A = new int[100000];		
		for(int i=0; i<100000;++i){
			A[i]=i+1;			
		}
		A[49999]=50001;
		assertEquals(50000, solution.solution(A));
	}
	
	@Test
	public void testEmptyArray(){
		A = new int[0];
		assertEquals(1,solution.solution(A));
	}
	
	@Test
	public void testSingleArrayEmptyValue(){
		A = new int[1];
		assertEquals(1,solution.solution(A));
	}
	
	@Test
	public void testSingleArrayoneValue(){
		A = new int[1];
		A[0]=6;
		assertEquals(1,solution.solution(A));
	}	
	
	@Test
	public void testDouble(){
		A = new int[2];
		A[0]=2;
		A[1]=4;
		assertEquals(3,solution.solution(A));
	}	

}
