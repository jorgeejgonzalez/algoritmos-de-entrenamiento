import java.util.stream.IntStream;


public class Solution {
	
	public int solution(int X, int[] A) {
		
		int check[]=new int[X];		
		
		
		for(int i=0;i<A.length;++i){
			check[A[i]-1]=1;
			
			if(IntStream.of(check).sum()==X){
				return i;
			}
		}
		
		return -1;
    }
}
