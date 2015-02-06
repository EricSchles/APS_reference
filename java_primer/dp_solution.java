import java.io.*; //always import *
import java.util.*;
public class dp_solution{
    public static <T> void print(T input){
	System.out.println(input);
    }

    public static long fib(int n){
	if ( n < 3) 
	    return 1;
	return fib(n-2) + fib(n-1);
    }

    public static long fib_better(int N){
	if (N < 3)
	    return 1;
	long[] fibonacci = new long[N+1];
	for(int n = 0;n <= N;n++) fibonacci[n] = 1;
	for(int n = 2; n <= N; n++){
	    fibonacci[n] = fibonacci[n-2] + fibonacci[n-1];
	}
	
	return fibonacci[N-1];
	
    }
    public static void main(String[] args) throws Exception{
        
       print(fib(10));
       print(fib_better(10));
    }
}
