import java.util.Scanner;
/*
How to run:
javac lesson_three.java
java lesson_three

Explanation:
There isn't very much new stuff here, which is good.  
The new things here are:

1) Exception handling
2) scoping within flow of control.

Let's actually tackle the latter first.  So why we need two print statements in the lines:

		if(len(name) <= 500){
			double x = (double) len(name);
			x += 7.0245;
			print(x);
		} else{
			long x = (long) len(name);
			x += 19238050;
			print(x);
		}

The reason for that is, x was defined within the scope of the if statement and also defined within the context of the else statement.
When you exit the if or else block of code, the x goes out of scope and so java deallocates the memory for the x variable.  To some
this is very efficient and part of the reason the java compiler is so fast.  For others this is actually a negative.  

I am of the camp of the latter.  Here is the rationale: 

If we want a variable x, it's likely we will create it outside the flow of control and then it's just on the stack for the entire program
whether or not we do anything with it!  Which to me defeats the purpose of such an optimization.  So in short, boo, this is a bad optimization.

Onto the next thing - try/catch:
	try{
	    return input.length();
	}
	catch(Exception e){
		return 0;
	}

Try catch has the same scoping rules as if/else, in this case a very good thing.  I won't go into why, but let's just say there are
security reasons for this decision.  A try statement is a block of code that is tried to execute, if in that block, Java encounters an
error it will move stop executing that block of code and move the catch block and execute if an exception of the type defined in the paranethesis is found.
Here we give a general exception, which will catch all possible errors.  

We could have specified a specific exception, like indexOutOfBounds or something else.  If you don't know what indexes are yet, don't worry.
We'll be covering that soon!
*/
public class lesson_three{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static int len(String input){
		try{
			return input.length();
		}catch(Exception e){
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		print("Hello there, what's your name?");
		String name = in.nextLine();
		if(name.equals("Eric")){
			print("Hello fearless leader, welcome back to the chamber of doom");
		}else{
			print("Hello"+name);	
		}
		if(len(name) <= 500){
			double x = (double) len(name);
			x += 7.0245;
			print(x);
		} else{
			long x = (long) len(name);
			x += 19238050;
			print(x);
		}
	}
}