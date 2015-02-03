/*
How to run:
javac lesson_one.java
java lesson_one

Explanation:
Here the big new thing is if / else.  

An if statement takes in a condition and executes only one that condition is true.

Definition condition := a statement that is either true or false, but not both.

As we see here in the iAmEric function, I take in a string and check to see if it's equal to Eric.
To check equality make use of '=='.  In java and programming languages generally, '=' is reserved for assignment.
Semantically they both actually do mean equality because we are saying variable on the left hand side is equal to value on
the right hand side. 

For example,

int x = 0;

However, this is turned into a different instruction in computer terms than equality.  It's a tough choice to make because its a major
stubling block for many programmers.  But it's a choice worth making.  

So what is a Boolean?  A Boolean is a variable that can only have a value of true or false, so in reality:

condition ~ Boolean.  

Technically the only Boolean values are true and false and conditions can evaluate to true or false via the various boolean operators, 
so they are almost equivalent but not exactly. 

The boolean operators are:
< - less than
> - greater than
<= - less than equal
>= - greater than or equal
== - equal

Notice that print(iAmEric("eric")); evaluates to false but should evaluate to true.  So this is a logical flaw.  So we write a 
second function to handle this. 

Unfortunately the Java == operator is really really poorly written and can't tell that "ERIC" and "eric".toUpperCase() should be the same.
I'm not sure exactly why this is happening in this instance, since toUpperCase returns a string.  But in general it's because the references
are different.  I'm guessing that because toUpperCase() returns a string from a different context it's saying, this string isn't a string
literal!  Which means they can't be the same.  Fortunately Java comes with a .equals method, which isn't dumb.

*/

class lesson_one<T>{

	public static Boolean iAmEric(String name){
		if(name == "Eric"){
			return true;
		} else{
			return false;
		}
	}

	public static Boolean iAmEricTwo(String name){
		name = name.toUpperCase();
		if( name.equals("ERIC")){
			return true;
		} else{
			return false;
		}
	}

	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		print(iAmEric("Eric"));
		print(iAmEric("Bob"));
		print(iAmEric("eric")); //this should pass but doesn't!

		print(iAmEricTwo("Eric"));
		print(iAmEricTwo("Bob"));
		print(iAmEricTwo("eric"));
	}
}