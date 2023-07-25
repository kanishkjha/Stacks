package practice;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		
		int[] arr= {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
