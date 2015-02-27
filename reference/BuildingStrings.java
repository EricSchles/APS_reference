import java.util.*;
import java.io.*;
import java.lang.*;

class BuildingStrings{

    public static <T> void print(T input){
	System.out.println(input);
    }
    
    public static void main(String[] args){
	StringBuilder s = new StringBuilder();
	s.append("Hello there");
	s.append("I am a string builder");
	s.append("time to use me appropriately");
	for(int i =0; i< 1000000;i++)
	    s.append("a"+i);
	print(s);
    }

}
