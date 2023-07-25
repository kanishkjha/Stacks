package practice;

public class StackUsingArray {

		private int data[];
		private int top;   // index of the topmost element of the stack
		
		public StackUsingArray() {
			data= new int[10];
			top=-1;
		}
		
		public StackUsingArray(int capacity) {
			data= new int[capacity];
			top=-1;
		}
		
		public boolean isEmpty() {
			return (top==-1);
		}
		
		public int size() {
			return top+1;
		}
		
		public int top() throws StackEmptyException {
			if(top==-1) {
				StackEmptyException e= new StackEmptyException();
				throw e;
			}
			return data[top];
		}
		
		public void push(int elem)throws StackFullException{
			if(size()==data.length) {
//				StackFullException e= new StackFullException();
//				throw e;
				doubleCapacity(elem);
			}
			
			top++;
			data[top]=elem;
		}
		
		public void doubleCapacity(int elem) {
			int temp[]=data;
			
			data=new int[temp.length*2];
			
			for(int i=0; i<temp.length; i++) {
				data[i]=temp[i];
			}
		}
		
		public int pop() throws StackEmptyException {
			if(top==-1) {
				StackEmptyException e= new StackEmptyException();
				throw e;
			}
			
			int temp=data[top];
			top--;
			return temp;
		}
		
}
