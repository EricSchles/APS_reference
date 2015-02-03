import java.util.ArrayList;

class ArrQueue{
	ArrayList list;
	public ArrQueue(){
		list = new ArrayList();
	}
	public <T> ArrQueue(T data){
		list = new ArrayList();
		list.add(data);
	}

	public void push(Object data){
		list.add(0,data);
	}
	public Object pop(){
		return list.remove( list.size() - 1 );
	}
	public String toString(){
		return list.toString();
	}
}