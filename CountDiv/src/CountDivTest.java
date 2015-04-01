import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountDivTest {
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution = new Solution();
	}
	
	@Test
	public void testMinValues(){
		assertEquals(2, solution.solution(0, 1, 1));
		assertEquals(0, solution.solution(0, 1, 2));
	}
	
	@Test
	public void testBigRangeValues(){
		assertEquals(2000000001, solution.solution(0, 2000000000, 1));
		assertEquals(1, solution.solution(0, 2000000000, 2000000000));
		assertEquals(2, solution.solution(0, 2000000000, 1000000000));
		assertEquals(1000000000, solution.solution(0, 2000000000, 2));
	}
	
	@Test
	public void testMidRangeValue(){
		assertEquals(250001, solution.solution(500000,1000000,2));
		assertEquals(166667, solution.solution(500000,1000000,3));
	}
	
	@Test
	public void testWeird(){
		assertEquals(2, solution.solution(7,14,7));		
	}

	@Test
	public void testDefault() {
		assertEquals(3, solution.solution(6, 11, 2));
	}

}
