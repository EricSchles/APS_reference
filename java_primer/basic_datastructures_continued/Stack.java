public class Stack<T>{
	LinkedList LL;
	public <T> Stack(T data){
		LL = new LinkedList(data);
	}
	public Stack(){
		LL = new LinkedList();
	}

	public <T> void add(T data){
		LL.add(data);
	}

	public Object pop(){
		return LL.pop();
	}

	public String toString(){
		return LL.toString();
	}
} 