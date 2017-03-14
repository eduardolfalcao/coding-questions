package datastructures.list;

public class LLNode <T> {
	
	private T v;
	private LLNode<T> next;
	
	public LLNode(T v) {
		this.v = v;
	}
	
	public T getV() {
		return v;
	}
	
	public void setV(T v) {
		this.v = v;
	}
	
	public LLNode<T> getNext() {
		return next;
	}
	
	public void setNext(LLNode<T> next) {
		this.next = next;
	}

}
