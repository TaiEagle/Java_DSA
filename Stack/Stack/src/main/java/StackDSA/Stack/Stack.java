package StackDSA.Stack;

public class Stack {
	//first node
	Node headNode = null;
	//last node
	Node tailNode = null;
	
	
	//Constructor
	Stack(){
		
		
		Node dummyNode = new Node();
		headNode = dummyNode;
		
	}

	/*This method adds something to the end of the list 
	 * Parameter 1: int ---data 
	 * This method returns nothing
	 * */
	void push(int data) {
		//create new node 
		Node newNode = new Node(data);
		
		
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
	
	
	
	/*This method returns the data in last node 
	 * This method returns the data inside the last node 
	 * 
	 * */
	int peek() {
		if(tailNode.data != null) {
			return tailNode.data;
		}
		return -1;
	}
	
}
