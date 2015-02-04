import java.io.*; //always import *
import java.util.*;
public class First{
    public static <T> void print(T input){
	System.out.println(input);
    }

    public static void main(String[] args) throws Exception{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> store = new ArrayList<Integer>();
	//print(in.readLine());
	
	  int numberCases = Integer.parseInt(in.readLine());
	  for(int caseNumber = 0; caseNumber < numberCases; caseNumber++){
	  
	       int n = Integer.parseInt(in.readLine());
	       store.add(n);
	       
	  }
	  print(store);

	 
    }
}
