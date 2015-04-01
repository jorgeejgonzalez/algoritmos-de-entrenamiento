
import java.util.Stack;


public class Solution {

	public int solution(String S) {
		if(S.isEmpty()){
			return 1;
		}
		
		if(S.length()%2!=0)
			return 0;
		
		Stack<String> openings = new Stack<String>();
		
		for(int i=0; i<S.length(); ++i){
			String c=String.valueOf(S.charAt(i));

			if(c.equals("{") || c.equals("[") || c.equals("("))
				openings.push(c);
				
			if(c.equals("}") && !openings.isEmpty())
				if(openings.peek().equals("{"))
					openings.pop();				
			
			if(c.equals("]") && !openings.isEmpty())
				if(openings.peek().equals("["))
					openings.pop();
			
			if(c.equals(")") && !openings.isEmpty())
				if(openings.peek().equals("("))
					openings.pop();	
		}
		
		if(openings.size()==0)
			return 1;
		else 
			return 0; 

	}

}
