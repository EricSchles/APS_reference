import java.io.*; //always import *
import java.util.*;
public class Fibonacci{
    public static <T> void print(T input){
	System.out.println(input);
    }

    public static long fib(int n){
	if ( n < 3) 
	    return 1;
	return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) throws Exception{
        
	print(fib(3));
    }
}
