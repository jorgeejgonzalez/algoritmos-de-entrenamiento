import java.util.Arrays;

public class Solution {
	
	public int solution(int[] A) {		
		int missing = 1;
		
		Arrays.sort(A);
		
		for(int i : A){			
			if(i==missing){
				missing++;
			}
		}
		
        return missing;
    }

}
