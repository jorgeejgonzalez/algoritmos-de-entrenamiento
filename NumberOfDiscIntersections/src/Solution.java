import java.util.Arrays;


public class Solution {
	
	public int solution(int[] A) {
		int result = 0;
	    int[] dps = new int[A.length];
	    int[] dpe = new int[A.length];

	    for (int i = 0; i < A.length; i++)
	    {
	        dps[Math.max(0, i - A[i])]++;
	        dpe[Math.min(A.length - 1, i + A[i])]++;
	    }

	    int t = 0;
	    for (int i = 0; i < A.length; i++)
	    {
	        if (dps[i] > 0)
	        {
	            result += t * dps[i];
	            result += dps[i] * (dps[i] - 1) / 2;
	            t += dps[i];
	        }
	        t -= dpe[i];
	    }
	    if(result<=10000000)
	    	return result;
	    else
	    	return -1;
    }

}
