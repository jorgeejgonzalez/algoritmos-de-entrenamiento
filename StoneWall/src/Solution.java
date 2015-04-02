import java.util.Stack;

public class Solution {
	
	public int solution(int[] H) {
		
		Stack<Integer> skyLineLevel = new Stack<Integer>();
		int minBlocks = 0;
		
		for(int i : H){
			while(!skyLineLevel.empty() && i < skyLineLevel.peek())
				skyLineLevel.pop();
			
			if(skyLineLevel.empty() || i > skyLineLevel.peek()){
				skyLineLevel.push(i);
				++minBlocks;
			}
			
		}	
		
        return minBlocks;
    }

}
