import java.io.*; //always import *
import java.util.*;
public class thing{
    public static <T> void print(T input){
	System.out.println(input);
    }

    public static void main(String[] args) throws Exception{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<HashMap<String,ArrayList<Integer>>> store = new ArrayList<HashMap<String,ArrayList<Integer>>>();
	
	//print(in.readLine());
	
	int numberCases = Integer.parseInt(in.readLine());
	for(int caseNumber = 0; caseNumber < numberCases; caseNumber++){
	  
	    ArrayList<String> tmp_store = new ArrayList<String>(Arrays.asList(in.readLine().split("\\s")));
	    ArrayList<Integer> values = new ArrayList<Integer>();
	    String key = tmp_store.get(0);
	    tmp_store.remove(0);
	    for( int i = 0; i<tmp_store.size();i++)
		values.add(Integer.parseInt(tmp_store.get(i)));
	    store.add(new HashMap<String,ArrayList<Integer>>());
	    store.get(caseNumber).put(key,values);
	}
	print(store);
	 
    }
}
