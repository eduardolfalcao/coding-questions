package datastructures.list;

public class LinkedList<T> {

	private LLNode<T> head;
	private int size = 0;
	
	//O(n)
	public T get(int index){
		LLNode<T> aux = head;
		for(int i = 0; i < index; i++)
			aux = aux.getNext();
		if(aux==null)
			return null;
		else
			return aux.getV();
	}
	
	//O(n)
	public void insert(T value){
		LLNode<T> n = new LLNode<T>(value);
		n.setNext(null);
		
		if(head == null)
			head = n;
		else{
			LLNode<T> aux = head;
			while(aux.getNext()!=null)
				aux = aux.getNext();
			aux.setNext(n);
		}
		size++;
	}	
	
	//O(n)
	public void insert(int index, T value){
		LLNode<T> n = new LLNode<T>(value);
		
		if(head==null)
			return;
		
		if(index == 0){
			n.setNext(head);
			head = n;
		}
		else{
			LLNode<T> aux = head;
			for(int i = 0; i < index-1; i++)
				aux = aux.getNext();
			n.setNext(aux.getNext());
			aux.setNext(n);
		}
		size++;
	}
	
	//O(n)
	public void remove(int index){
		if(head==null)
			return;
		
		if(index == 0)
			head = head.getNext();
		else{
			LLNode<T> aux = head;
			for(int i = 0; i < index-1; i++)
				aux = aux.getNext();
			aux.setNext(aux.getNext().getNext());
		}
		size--;		
	}
	
	public void reverseI(){
		if(size<=1)
			return;
		else{
			LLNode<T> prev, cur, next;
			prev = next= null;
			cur = head;
			while(cur.getNext()!=null){
				next = cur.getNext();
				cur.setNext(prev);
				prev = cur;
				cur = next;
			}
			cur.setNext(prev);
			head = cur;
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		LLNode<T> aux = head;
		while(aux!=null && aux.getNext()!=null){
			res += aux.getV()+", ";
			aux = aux.getNext();
		}	
		res += aux.getV();
		return res;
	}
	
	//O(1)
	public int getSize() {
		return size;
	}
}
