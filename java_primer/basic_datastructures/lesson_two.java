import java.util.ArrayList;

class lesson_two{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		//making a computer count
		for(int i=0;i<200;i++){
			print(i+" is the number we are up to");
		}
		//notice starts at 0, stops at 199

		//basic array
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int elem: numbers){
			print(elem);
		}//prints all the elements

		//breaking out of a for loop prematurely
		for(int elem: numbers){
			if(elem%2==0){
				break;
			} else{
				print(elem);
			}
		}

		for(int elem : numbers){
			if(elem%2==0){
				continue;
			}
			print(elem);
			//skips even elements all together
		}	

		ArrayList list = new ArrayList();
		for(int i = 0;i < 100;i++){list.add(i);}
		print(list);
		//or
		for(Object elem : list){ print(elem);}

	}
}