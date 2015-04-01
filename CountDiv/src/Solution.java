import javax.lang.model.type.TypeVisitor;


public class Solution {	
    public int solution(int A, int B, int K) {    	
    	
    	return Math.abs((B/K) - ((A-1)/K));
    	 
    }

}
