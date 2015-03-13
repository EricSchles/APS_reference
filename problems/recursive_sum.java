import java.util.*;
import java.io.*;
public class recursive_sum{
    public static long[][] precal(){
	int i,j;
	long[][] T = new long[15][15];
	for(i=1;i<=14;i++)
	    T[i][1]=1;
	for(i=1;i<=14;i++)
	    T[1][i]=i+T[1][i-1];
	for(i=2;i<=14;i++){
	    for(j=2;j<=14;j++){
		T[i][j] = T[i-1][j]+T[i][j-1];
	    }
	}
	return T;
    }
    /*public static int recursive_sum(int k,int n){
	if(k == 0){
	    return n;
	}
	long sum=0;
	for(int i = 1; i <= n; i++){
	    sum+=recursive_sum(k-1,i);
	}
	return sum;
    }
    */
    public static void main(String[] args) throws Exception{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	long[][] T = precal();
	String line = in.readLine();
	int terminal_condition = Integer.parseInt(line);
	int k;
	int n;
	for(int i=0;i<terminal_condition;i++){
	    line = in.readLine();
	    String[] ints = line.split("\\s");
	    k = Integer.parseInt(ints[0]);
	    n = Integer.parseInt(ints[1]);
	    System.out.println(""+T[k][n]);
	}
    }
}
