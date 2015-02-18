import java.util.*;
import java.io.*;

public class test{
	public static <T> void print(T input){
		System.out.println(input);
	} 
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null){
			Integer num = Integer.parseInt(line);
			num++;
		}
	}
}