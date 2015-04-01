import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args){
		String field = "BMC_TEST_INPUT_MAGIC";
		System.out.println(sweepMines(splitField(field)));
	}
	
	public static String sweepMines(String[][] field){
		String sweepedField="";
		for(int i=0;i<field.length;++i){
			for(int c=0;c<field[i].length;++c){				
				if(field[i][c].equals("X")){
					sweepedField+="X";
				}
				else{
					int counter=0;					
					int kstart = i==0 ? 0 : -1;
					int jstart = c==0 ? 0 : -1;
					int kend = i==(field.length-1) ? 0 : 1;
					int jend= c==(field[i].length-1) ? 0 : 1;
					
					for(int k=kstart;k<=kend;++k)
						for(int j=jstart;j<=jend;++j)		
							if(field[i+k][c+j].equals("X"))							
								++counter;					
					
					sweepedField+=counter;
				}				
				if(c<field[i].length-1)
					sweepedField+=" ";
			}
			if(i<field.length-1)
				sweepedField+="\n";
		}
		return sweepedField;
	}
	
	public static String[][] splitField(String field){
		List<String> split1 = Arrays.asList(field.split("\n"));
		String[][] splitted = new String[split1.size()][];		
		int i=0;		
		for(String split : split1){
			splitted[i] = split.split(" ");
			++i;
		}
		return splitted;
	}
}
