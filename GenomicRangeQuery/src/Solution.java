
public class Solution {
	
	 public int[] solution(String S, int[] P, int[] Q) {
	     
		 int genoms[][] = new int[3][S.length()+1];
		 
		 short a,c,g;
		
		 for(int i=0;i<S.length();++i){
			 a=0;
			 c=0;
			 g=0;
			 
			 switch(S.charAt(i)){
			 case 'A':
				 a=1;
				 break;
			 case 'C':
				 c=1;
				 break;
			 case 'G':
				 g=1;
				 break;
			 }
			 
			 genoms[0][i+1]=genoms[0][i]+a;
			 genoms[1][i+1]=genoms[1][i]+c;
			 genoms[2][i+1]=genoms[2][i]+g;
		 }
		 
		 
		 int[] result= new int[P.length];
		 
		 for(int i=0;i<P.length;++i){
			 int fromIndex = P[i]+1;
			 int toIndex = Q[i]+1;
			 if (genoms[0][toIndex] - genoms[0][fromIndex-1] > 0) {
				 result[i] = 1;
			 }
			 else if (genoms[1][toIndex] - genoms[1][fromIndex-1] > 0) {
				 result[i] = 2;
			 }
			 else if (genoms[2][toIndex] - genoms[2][fromIndex-1] > 0) {
				 result[i] = 3;
			 } 
			 else {
				 result[i] = 4;			 
			 }
		 }
		 
		 return result;
	 }
	 
}
