
public class Solution {
	
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
		int counters[] = new int[N];
		
		int maxCounter=0;
		
		for(int i=0;i<A.length;++i){
			if(A[i]==counters.length+1){
				for(int c=0;c<counters.length;++c){
					counters[c]=maxCounter;
				}
			}
			else{
				counters[A[i]-1]++;
				if(maxCounter<counters[A[i]-1]){
					maxCounter = counters[A[i]-1];
				}
				
			}			
			
		}
		return counters;
    }
	

}
