package practice;

public class StackUse {

	public static void main(String[] args) throws StackFullException {
//		StackUsingArray stack = new StackUsingArray(3);
		StackUsingLL<Integer> stack= new StackUsingLL<Integer>();
		
		for(int i=1; i<10; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop()); 
			} catch (StackEmptyException e) {
				// Never reach here
			}
		}

	}

}
