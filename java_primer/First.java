import java.io.*; //always import *

public class First{
    public static <T> void print(T input){
	System.out.println(input);
    }

    public static void main(String[] args) throws Exception{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	print(in.readLine());
    }
}
