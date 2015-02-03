public class Queue{
	LinkedList LL;
	public <T> Queue(T data){
		LL = new LinkedList(data);
	}
	public Queue(){
		LL = new LinkedList();
	}

	public <T> void push(T data){
		LL.insert(data);
	}

	public Object pop(){
		return LL.pop();
	}
	
	public String toString(){
		return LL.toString();
	}
}