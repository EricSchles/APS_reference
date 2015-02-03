/*
How to compile:
javac lesson_four.java
java lesson_four

Explanation:

In this lesson we will see some of the real power of java.  The first big thing here is inheritance.  The second big thing is
method overriding.  Other than that, this lesson should be completely clear.

So let's start with inheritance:

Inheritance is the ability for one class to inherit the methods and fields (variables) from another class.  In this example, we
use a very simple example: two classes A and B, where B inherits from A.  This means that anything public to A will be accessible 
in B.  

For instance, look at the get_first method defined in A.  I use in main with the b object.  Although I never defined it in B!  
Also, take a look at the print_vals methods in A and B.  Notice the use of super.print_vals which calls A's print_vals method.
Thus we can add to the origin method in B or just make use of the methods of A in B.  This allows us to write very generalized code.

We can start with simple ideas and let the number of classes expand and change as we need to add functionality.  It's important to keep
in mind that you shouldn't overuse inheritance.  If you're classes are too heavily object oriented it's possible you could be calling a
method you defined in some class years and years ago and forgot how it works.  For this reason it's important to balance object oriented
generalization with modularity, don't rewrite too much and don't rewrite too little. 

I know this may sound vague but with time it will become clear how to actually do this.  And its also important to keep in mind, this is
a matter of taste and will differ between different people.

Another thing to notice is the use of super in the constructor.  When you don't call any methods, super will call the constructor of
the parent class.  Also known as the super class.  This is the class that is inherited from.

*/
class A{
	public Integer first;
	public String second;
	private Integer a_first;
	private String a_second;
	
	A(int first, String second){
		this.first = first;
		this.second = second;
		this.a_first = 27;
		this.a_second = "this shouldn't be available.";
	}

	public static <T> void print(T input){
		System.out.println(input);
	}

	public void print_vals(){
		print(this.first.toString() + " " + this.second);
	}

	public int get_first(){
		return this.first;
	}
}

class B extends A{
	public String third;
	public String fourth;

	B(int first, String second,String third, String fourth){
		super(first,second);
		this.third = third;
		this.fourth = fourth;
	}
	public static <T> void print(T input){
		System.out.println(input);
	}

	public void print_vals(){
		super.print_vals();
		print(this.third + " " + this.fourth);
	}


}
public class lesson_four{
	
	public static void main(String[] args){
		A a = new A(5,"Hello");
		B b = new B(6,"waaa","there","are");

		a.print_vals();
		b.print_vals();
		b.print(b.get_first());
		//B.print(b.a_first); - doesn't work!
		//B.print(b.a_second); - doesn't work!
	
	}
}