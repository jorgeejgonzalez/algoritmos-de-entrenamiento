import java.util.Arrays;

public class Solution {
	
	public int solution(int[] A) {
		Arrays.sort(A);
		
		if(A.length==0 || A[0]!=1)
			return 1;
		
		for(int i=0;i<A.length;++i){			
			if(i+A[0]<A[i]){				
				return i+A[0];
			}
		}
		
		return A.length+1;
    }

}
