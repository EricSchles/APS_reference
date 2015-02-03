import java.util.*;
class lesson_three{

	public static <T> void print(T input){
		System.out.println(input);
	}

	public static boolean isDigit(String str){
		try{
			int d = Integer.parseInt(str);
		}catch(NumberFormatException nfe){
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		
		print("Please enter a number, must be less than 10 (can be negative)\n");
		Scanner n = new Scanner(System.in);
		Integer x = n.nextInt();
		print("Counting to up to 10 by 1's");
		while(x < 10){
			if(x >= 10){
				print("You entered a number that is too big");
				break;
			}
			print(x);
			x += 1;
		}
		n.nextLine();//throws away next line
		print("Please enter values and then the terminal value 'a'.  These values will be printed for you.");
		ArrayList ll = new ArrayList();
		String next_line = n.nextLine();
		do{
			if( isDigit(next_line) ){
				ll.add(next_line);
			}else if(next_line.contains("a") ){
				print(ll);
				print("Thanks for playing!");
				break;
			}else{
				print("You entered a character I didn't understand");
				break;
			}
			next_line = n.nextLine();
		}while(true);
	}
}