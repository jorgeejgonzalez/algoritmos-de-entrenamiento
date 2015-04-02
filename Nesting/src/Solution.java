import java.util.Arrays;
import java.util.Stack;


public class Solution {

	public int solution(String S) {
		if(S.isEmpty())
			return 1;		
		if(S.length()%2!=0)
			return 0;
		
		Stack<String> openings = new Stack<String>();
		
		Arrays.asList(S.split(""))
			  .forEach(s -> {
				  if(s.equals("(")) 
					  openings.push(s);
				  if(s.equals(")") && openings.isEmpty()) 
					  openings.push(s);
				  if(s.equals(")") && openings.size()>0) 
					  openings.pop();
			  });
		
		if(openings.size()>0)
			return 0;
		else
			return 1;
	}

}
