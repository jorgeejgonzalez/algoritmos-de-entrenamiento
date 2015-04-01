import java.util.HashSet;
import java.util.Set;



public class Solution {
	
	public int solution(int[] A) {
        if(A.length==0 || A.length==1)
        	return A.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i:A)
        	set.add(i);
        return set.size();
    }

}
