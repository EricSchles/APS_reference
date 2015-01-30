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