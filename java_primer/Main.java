class Node<T>{

	T value;
	Node ref;
	
	Node(T value, Node ref){
		this.value = value;
		this.ref = ref;
	}

	public T getVal(){
		return this.value;
	}

	public Node getNextNode(){
		return this.ref;
	}

	public void setNode(Node new_ref){
		this.ref = new_ref;
	}

	public T ToString(){
		return this.value;
	}
}

public class Main{
	
	public static <T> void print(T x){
		System.out.println(x);
	}
	public static void main(String[] args){

		Node x = new Node(5,null);
		Node y = new Node(7,null);
		x.setNode(y);
		print(x.getNextNode().ToString());
	}
}