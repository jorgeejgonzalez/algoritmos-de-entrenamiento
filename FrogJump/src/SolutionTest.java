import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	private Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}

	@Test
	public void testDefault() {
		int value =solution.solution(10, 85, 30);
		assertEquals(3, value);
	}
	
	@Test
	public void testValueMin() {
		int value =solution.solution(1,2, 1);
		assertEquals(1, value);
	}
	
	@Test
	public void testValueMax() {
		int value =solution.solution(1, 1000000000, 1000000000);
		assertEquals(1, value);
	}
	
	@Test
	public void testManyJumps() {
		int value =solution.solution(2, 1000000000-2, 2);
		assertEquals(499999998, value);
	}



}
