import java.util.stream.IntStream;


public class Solution {
	
	public int solution(int[] A) {
		if(A.length==2){
			return Math.abs(A[0]-A[1]);
		}
		
		int sumPart1 = A[0];
		int sumPart2 = IntStream.of(A).sum()-A[0];
		
		int minimalDifference=Math.abs(sumPart1-sumPart2);

		for(int i=1;i<A.length;++i){
			sumPart1+=A[i];
			sumPart2-=A[i];
			
			int difference=Math.abs(sumPart1-sumPart2);
			
			if(difference<minimalDifference){
				minimalDifference=difference;
			}
		}
		
        return minimalDifference;
    }

}
