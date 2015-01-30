import java.io.*;
import java.util.*;

public class Dicter{
	public static <T> void print(T input){
		System.out.println(input);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		String line;
		
		Map<String, Integer> dict = new HashMap<String,Integer>();
		while( (line =in.readLine()) != null ){
			String[] cur_line = line.split("\\s"); 
			print(cur_line[0]);
			dict.put(cur_line[0], Integer.parseInt(cur_line[1]));
			print(dict);
		}
		
	}
}