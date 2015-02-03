/*

In this tutorial we'll go through getting input from the user
and processing it.

In this first example we'll simply get the input from the command line
and then display it to the user

*/

import java.io.*;

public class first{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(in.readLine());
		//this reads in only a single case.
	}
}