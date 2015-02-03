import java.util.Scanner;

/*
Explanation:

In the last exercise we introduced you to the if/else statements which are called flow of control, generally.

Now that we understand how boolean statements are evaluated, let's understand the scoping rules around flow of control.

Here we initialize x to 14 and then if x is less than 17 after we get input from the user, then we print that integer, otherwise we set the value to 0.
Notice that we imported our first method here, java.util.Scanner.

If we wanted the whole library we could have done:

import java.util.*;

We also could have done:

import java.*;

But then we would have needed to change our scanner to:

util.Scanner

Java does naturally have all the libraries one could reference available to it, however importing changes the way in which the libraries are called.

So instead of having to type java.util.Scanner we can just type Scanner (assuming we had an import java.util.Scanner statement).  

The last thing to note is the type conversion happening here:

Specifically: Integer.toString() for the x value.

All the built in types have toString methods which are used to convert other types to strings.  Typically this is done so that non-string output and string output 
can be printed on one line.  There are a number of other type conversion tools Java exposes.  We'll look at some of theses in next exercise.
*/
class lesson_two<T>{
	
	public static <T> void print(T input){
		System.out.println(input);
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 14;
		print("Please enter a number:");
		int user_input = input.nextInt();
		if( user_input < 17 ){
			x = user_input;
		} else{
			x = 0;
		}

		print("Your answer is:"+Integer.toString(x));
	}
}