class lesson_one {

	public static <T> void print(T data){
		System.out.println(data);
	}
	public static void main(String[] args){
		linked_list ll = new linked_list();
		ll.append(4);
		ll.append(7);
		ll.append(9);
		print(""+ll);
	}

}