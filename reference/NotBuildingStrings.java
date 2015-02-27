class NotBuildingStrings{

    public static <T> void print(T input){
	System.out.println(input);
    }
    
    public static void main(String[] args){
	print("Hello there");
	print("I am a string builder");
	print("time to use me appropriately");
	for(int i =0; i< 100000;i++)
	    print("a"+i);
	
    }

}
