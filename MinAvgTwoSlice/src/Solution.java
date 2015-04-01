
public class Solution {
	public int solution(int[] A) {
		if(A.length==2){
			return 0;
		}
		
		float minAverage=0.0f;
		int minPos=0;
				
		for(int i=0; i<A.length-1;++i){
			float average = (A[i]+A[i+1])/(2.0f);
			if(average<minAverage || i==0 ){
				minAverage=average;
				minPos=i;
			}
			if(i<(A.length-2)){
				average = (A[i]+A[i+1]+A[i+2])/(3.0f);
				if(average<minAverage || i==0 ){
					minAverage=average;
					minPos=i;
				}
			}
		}
		
		return minPos;
    }
	

}
