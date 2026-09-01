package StackDSA.Stack;

public class Driver_Test {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.pop();
		
		int data = stack.peek();
		System.out.println(data);
	}
	
}
