#Lecture 1

Welcome to Algorithmic Problem Solving!

##About Me

* Adjunct Professor @ NYU - Here and CUSP
* Slavery Fighter @ Manhattan District Attorney
* Slavery Researcher @ NYU
* Developer Evangelist @ Syncano - if curious: syncano.com

My Email: es3066@nyu.edu
My Github - www.github.com/EricSchles

##About the course

* You should take this course for three main reasons:
	* To prepare for Hueristic Problem Solving - typically graduate students
	* Practice for next years ICPC competition
	* To help algorithms course make sense in an applied way

* About HPS:
	* Taught by Dennis Shasha 
	* Teaches how far you can take programming
	* Prepares you for any technical interview

* About ICPC:
	* Prepares you to be a competitive programmer
		* The mindset is "don't just program a machine - become one"
		* Learn how to program quickly and correctly
	* It's a ton of fun
		* Meet programmers from other school
		* Travel on NYU's dime
		* Form lasting bonds with other NYU coders
	* Get All the jobs
		* Recruiters from IBM come to the regional challenge as well as the national challenge
		* It looks very good on the resume just generally
		* prepares you for many entry level job interviews
	* My personal objective - win next year!

* Applying what you learn!
	* Learn by doing rather than watching!
	* Learn the technical difficulties in everything
	* Know the algorithms - problem and solution (in your bones)

## Lecture 1 

	* Understanding the difference between Scanner and BufferedReader
	* Review of Basic Data Structures
	* Review of the Debugger in eclipse
	* Review of Exceptions
	* BigInt
	* Dynamic Programming

### Scanner versus BufferedReader

* Do the same thing in a different way
* BufferedReader reads data faster - matters for this course and for competitive programming
```
	import java.io.*;
	import java.util.*;


	public class Test{
		public static <T> void print(T input){
		System.out.println(input);
	}
		public static void main(String[] args) throws Exception{
		
			long start = System.nanoTime();
			Scanner in = new Scanner(new FileReader("file.txt"));
			String line;
			while(in.hasNext()){
				in.next();
			}
			long end = System.nanoTime();
			print(end - start);
			print("for Scanner");
			start = System.nanoTime();
			BufferedReader b_in = new BufferedReader(new FileReader("file.txt"));
			while((line = b_in.readLine()) != null){
				line += "h";
			}
			end = System.nanoTime();
			print(end - start);
			print("for buffered reader");
			print("All done");

		}
	}
```

* BufferedReader finishes faster than Scanner
* Not shown here: BufferedReader can store more characters than Scanner



### Basic Data Structures

* Linked Lists
	* Make use of the arraylist for this

```
	import java.util.*;

	public class Listing{

		public static <T> void print(T input){
			System.out.println(input);
		}

		public static void main(String[] args){
			ArrayList<Integer> listing = new ArrayList<Integer>();
			listing.add(5);
			listing.add(7);
			listing.add(9);
			print(listing.get(0));
			listing.remove(0);
			print(listing);
		
			ArrayList<ArrayList<Integer>> d2_list = new ArrayList<ArrayList<Integer>>();
			d2_list.add(new ArrayList<Integer>());
			d2_list.get(0).add(5);
			d2_list.get(0).add(7);
			d2_list.get(0).add(9);
			print(d2_list);

		}
	}
```

* Dictionaries
	* Make use of maps and hashmaps

```
	import java.io.*;
	import java.util.*;

	public class Main{
		public static <T> void print(T input){
			System.out.println(input);
		}

		public static void main(String[] args) throws Exception{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			
			Map<String, Integer> dict = new HashMap<String,Integer>();
			while( (line = in.readLine()) != null ){
				String[] cur_line = line.split("\\s"); 
				print(cur_line[0]);
				dict.put(cur_line[0], Integer.parseInt(cur_line[1]));
				print(dict);
			}
			
		}
	}
```

### Exceptions in Java


Exceptions are Objects specifying an exceptional condition.  

Example:
```
	import java.io.*;
	import java.util.*;


	public class Test{
		public static <T> void print(T input){
		System.out.println(input);
	}
		public static void main(String[] args) throws Exception{
		
			try{
				//String blarg = "Hello there everyone";
				//String[] x =  blarg.split("\\s");
				//print(x[4]);
				print("here we are");
			}catch(Exception e){
				print("why didn't we go there?");
			}finally{
				print("We really shouldn't have gotten here, oh well!");
			}
		}
	}
```

### The debugger in eclipse

http://cs.nyu.edu/~es3066/datastructures/recitation4.html

### BigInt

If you try to store a number that's too big use the BigInteger instead - this comes up A LOT in this course

### Dynamic Programming


* When to use:
	* if you can use recursion, you can use DP
	* makes your code much much faster because you don't recalculate at each iteration
	* essentially this is a 'trick of the light'

#####Example
public class Optimizing {
	
	public static long binomial(int n, int k){
		if (k == 0) return 1;
		if (n == 0) return 0;
		return binomial(n-1,k) + binomial(n-1, k-1);
	}

	public static long fast_binomial(int N, int K){
		long[][] binomial = new long[N+1][K+1];

		for(int k = 1; k <= K; k++ ) binomial[0][k] = 0;
		for(int n = 1; n <= N; n++ ) binomial[n][0] = 1;

		//bottom-up dynamic programming
		for(int n = 1; n <= N; n++)
			for(int k = 1; k <= K; k++)
				binomial[n][k] = binomial[n-1][k-1] + binomial[n-1][k];
		return binomial[N][K];
	}
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){

		long start = System.nanoTime();
		binomial(15,25);
		long end = System.nanoTime();
		print("With Recursion");
		print(end - start);
		start = System.nanoTime();
		fast_binomial(15,25);
		end = System.nanoTime();
		print("With Dynamic programming");
		print(end - start);
	}
}

Contest:























	* Our history
		* Last semester our top team completed all the problems
		* All of our teams finished in the top half (top 25 teams of 50 teams)
		* Year before that we won regionals and did very well in the world finals
		* Bowen (who is next store) was on the team that won regionals - he is extremely capable

