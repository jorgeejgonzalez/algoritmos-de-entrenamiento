import java.util.Arrays;


public class Solution {
	
	public int solution(int[] A) {        
        Arrays.sort(A);
        if(A.length>2)
        	for(int i=0; i<A.length-2; ++i)
        		if(A[i] > A[i+2]-A[i+1]  && A[i+1] > A[i+2]-A[i] &&  A[i+2] > A[i+1] - A[i])
        			return 1;
        return 0;
    }

}
