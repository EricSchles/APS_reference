import java.io.*;
import java.util.*;


public class Test{
	public static <T> void print(T input){
	System.out.println(input);
}
	public static void main(String[] args) throws Exception{
	
		try{
			String blarg = "Hello there everyone";
			String[] x =  blarg.split("\\s");
			print(x[4]);
			print("here we are");
		}catch(Exception e){
			print("why didn't we go there?");
		}finally{
			print("We really shouldn't have gotten here, oh well!");
		}
	}
}