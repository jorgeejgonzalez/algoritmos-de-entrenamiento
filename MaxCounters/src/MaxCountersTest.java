import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;


public class MaxCountersTest {
	
    int A[];
	
	Solution solution;
	
	@Before
	public void setUp(){
		solution=new Solution();
	}

	@Test
	public void testDefault() {
		A = new int[7]; 
		
		A[0] = 3;
		A[1] = 4;
		A[2] = 4;
		A[3] = 6;
		A[4] = 1;
		A[5] = 4;
		A[6] = 4;
		
		int[] retorno=solution.solution(5, A);
		
		assertEquals(13, IntStream.of(retorno).sum());		
	}

}
