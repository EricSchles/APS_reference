import java.io.*;
import java.util.*;

public class Second{
    public static <T> void print(T input){
	System.out.println(input);
    }

    public static void main(String[] args) throws Exception {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	int numCases = Integer.parseInt(in.readLine());
	String line;
	for(int caseNum = 0; caseNum < numCases; caseNum++){
	    line = in.readLine();
	    String[] elems = line.split("\\s");
	    arr.add(new ArrayList<Integer>());
	    for(String elem : elems){ 
		arr.get(caseNum).add(Integer.parseInt(elem));
		//print(elem); - to show output - this is part of testing
		
	    }
	
	}
	print(arr);


    }
}
