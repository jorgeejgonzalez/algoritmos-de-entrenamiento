import java.util.Arrays;

public class Solution {
	
	public int solution(int[] A) {
		if(A.length==0){
			return 1;
		}
		
		if(A.length==1 && A[0]!=1){
			return 1;
		}
		
		Arrays.sort(A);
		
		int padding=A[0];
		
		for(int i=0;i<A.length;++i){			
			if(i+padding<A[i]){				
				return i+padding;
			}
		}
		
		return -1;
    }

}
