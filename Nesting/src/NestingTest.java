import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NestingTest {
	
	Solution solution;
	String S;
	
	@Before
	public void setUp(){
		solution = new Solution();
	}
	
	@Test
	public void testStringEmpty() {
		S = "";
		assertEquals(1, solution.solution(S));
	}

	@Test
	public void testOddString() {
		S = "(";
		assertEquals(0, solution.solution(S));
	}
	
	@Test
	public void testSimpleString() {
		S = "()";
		assertEquals(1, solution.solution(S));
	}
	
	@Test
	public void testNestedString() {
		S = "(())";
		assertEquals(1, solution.solution(S));
	}
	
	@Test
	public void testNestedFailString() {
		S = "(()";
		assertEquals(0, solution.solution(S));
	}

}
