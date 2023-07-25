package practice;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	int size() {
		return size;
	}
	
	T top() throws StackEmptyException {
		if(size==0) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	boolean isEmpty() {
		return (head==null);
	}
	
	void push(T elem) {
		Node<T> newElement= new Node<T>(elem);
		
		newElement.next=head;
		head= newElement;
		size++;
	}
	
	T pop() throws StackEmptyException {
		if(size==0) {
			throw new StackEmptyException();
		}
		
		Node<T> poppedElement= head;
		head=head.next;
		size--;
		
		return poppedElement.data;
		
	}
}
