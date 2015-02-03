import java.util.Random;

/*
how to compile:
javac lesson_five.java interfacing.java
java lesson_five

Explanation:

Interfaces are useful for prototyping code and also for making sure someone else
writes all the code they are supposed to, in order to use other code.

For instance, say you wrote something that assumes every object you pass around has a toString method
or a has_cats method.  If you pass in an object that doesn't have such a method, the code may fail.

By forcing all objects passed in to conform to an interface, it will always be clear what methods or variables are
required.  

This isn't particularly useful when you are working by yourself, however when you work with others and particularly on
large scale projects, this is extremely useful.  Of course we could all just be good communicators, but that doesn't
really tend to happen.

As you can see here I write my method signatures in interfacing.java and then give the methods bodies here in lesson_five.java.
There are a few things I'm confused on so I won't be able to speak to them.  

1) why can't I use Object and then check if my method exists for has_rabbies?
2) why can't I use type Animal, since bunny extends Animal shouldn't this work?

I won't be able to speak intelligently about intefacing until I understand this, and unfortunately I don't.

So, for an explanation I suggest looking elsewhere, for now.
*/
class implementar implements interfacing {
	//prints hello + x
	public void hello(String x){
		print("Hello"+x);
	}
	
	//wraps System.out.println
	public <T> void print(T input){
		System.out.println(input);
	}
	
	public Boolean has_rabbies(bunny obj){
		return obj.has_rabbies();
	}
	//check if obj has .rabbies property.  if set to true, return true
	//else return false.
}

class Animal{
	public int age;
	public String gender;
	public Boolean rabbies;	
}
class bunny extends Animal{

	
	bunny(int age,String gender){
		this.age = age;
		this.gender = gender;
		this.rabbies = give_rabbies();
	}

	private Boolean give_rabbies(){
		Random rand_gen= new Random();
		int rand_num = rand_gen.nextInt(9999999);
		if(age > 3 && age < 7){
			if(rand_num%7 == 3){
				return true;
			}
		} else if(age <= 3){
			if(rand_num%29 == 3){
				return true;
			}
		} else if (age> 7){
			if(rand_num%2==0){
				return true;
			}
		}
		return false;
	}

	public Boolean has_rabbies(){
		return this.rabbies;
	}
}
public class lesson_five{

	public static void main(String[] args){
		implementar x = new implementar();
		bunny rabbit = new bunny(2,"male");
		x.print("Hello");
		x.hello(" Eric");
		x.print(x.has_rabbies(rabbit));
	}
}