class Node<T>{
	T data;
	Node next;

	Node(T data){
		this.data = data;
		this.next = null;
	}
}

public class linked_list{
	Node head;

	public linked_list(){
		this.head = new Node(null);
	}
	
	public static <T> void print(T data){
		System.out.println(data);
	}
	public <T> linked_list(T data){
		this.head = new Node(data);
	}

	Node getHead(){
		return this.head;
	}

	private <T> void setHead(T data){
		this.head = new Node(data);
	}
	public <T> void append(T data){
		Node cur = this.getHead();
		if(cur.data == null){
			this.setHead(data);
		} else{
				
				while(cur.next != null){
		
					cur = cur.next;
				}
			
				Node new_node = new Node(data);
				cur.next = new_node;
			
			}
	}

	public String toString(){
		String result = "";
		Node cur = this.getHead();
		while(cur.data != null && cur.next != null){
			result += " " +cur.data.toString();
			cur = cur.next;
		}
		if(cur != null){
			result += " "+ cur.data;
		}
		return result;
	}
}