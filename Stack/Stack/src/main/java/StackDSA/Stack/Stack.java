package StackDSA.Stack;

public class Stack<type> {
	//first node
	Node<?> headNode = null;
	//last node
	Node<?> tailNode = null;
	
	
	//Constructor
	Stack(){
		
		
		Node<type> dummyNode = new Node<>();
		headNode = dummyNode;
		
	}

	@SuppressWarnings("unchecked")
	/*This method adds something to the end of the list 
	 * Parameter 1: int ---data 
	 * This method returns nothing
	 * */
	void push(type data) {
		//create new node 
		Node<type> newNode = new Node<>(data);
		
		
		//if the linked list is empty 
		if(tailNode == null) {
			headNode.NextNode = newNode;
			newNode.lastNode = headNode;
			tailNode = newNode;
			
		}
		else {
			newNode.lastNode = tailNode;
			tailNode.NextNode = newNode;
			
			tailNode = newNode;
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	/*This method removes a node from the end of the list
	 * 
	 * This method returns nothing
	 * 
	 * */
	void pop() {
		if(tailNode.lastNode != null) {
			tailNode = tailNode.lastNode;
			tailNode.NextNode = null;
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	/*This method returns the data in last node 
	 * This method returns the data inside the last node 
	 * 
	 * */
	type peek() {
		if(tailNode.data != null) {
			return (type) tailNode.data;
		}
		return null;
	}
	
}
