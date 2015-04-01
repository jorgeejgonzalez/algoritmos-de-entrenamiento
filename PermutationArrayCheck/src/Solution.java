import java.util.Arrays;
public class Solution {
	
	public int solution(int[] A) {
		
		if(A.length==1){
			if(A[0]==1)
				return 1;
			else
				return 0;
		}
		
		Arrays.sort(A);
		
		if(A[0]!=1){
			return 0;
		}
		if(A[A.length-1]!=A.length){
			return 0;
		}
		
		for(int i=0;i<A.length;++i){			
			if((A[i]!=i+1) || A[i]>100000){
				return 0;
			}
		}
		
        return 1;
    }

}
