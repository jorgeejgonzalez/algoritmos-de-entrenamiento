import java.util.Arrays;
import java.util.HashSet;


public class Solution {
	
	public int solution(int[] A) {
		
		int missing = 1;
		
		Arrays.sort(A);
		
		for(int i=0;i<A.length;++i){			
			if(A[i]==missing){
				missing++;
			}
		}
		
        return missing;
    }

}
