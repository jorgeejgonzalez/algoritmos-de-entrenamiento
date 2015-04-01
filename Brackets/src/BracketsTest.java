import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BracketsTest {
	
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
	public void testSimpleParentheses(){
		S = "()";
		assertEquals(1, solution.solution(S));
	}
	
	@Test
	public void testSimpleBrackets(){
		S = "[]";
		assertEquals(1, solution.solution(S));
	}
	
	@Test
	public void testSimpleCurvyBrackets(){
		S = "{}";
		assertEquals(1, solution.solution(S));
	}
	
	@Test
	public void testDefaultOne(){
		S = "{[()()]}";
		assertEquals(1, solution.solution(S));
	}
	
	@Test
	public void testDefaultZero(){
		S = "([)()]";
		assertEquals(0, solution.solution(S));
	}

}
