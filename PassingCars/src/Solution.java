import java.util.stream.IntStream;


public class Solution {
	
	public int solution(int[] A) {
        int passingCars=0;
        
        int sumArray = IntStream.of(A).sum();
        
        for(int i=0;i<A.length;++i){
        	if(A[i]==0){
        		passingCars+=sumArray;
        		if(passingCars>1000000000){
        			return -1;
        		}
        	}
        	else{
        		--sumArray;
        	}
        }
		
        return passingCars;
    }

}
