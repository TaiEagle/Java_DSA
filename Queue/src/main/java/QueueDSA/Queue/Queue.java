package QueueDSA.Queue;

import java.util.ArrayList;
public class Queue <type>{
	Node<?> head;
	Node<?> tail;
	
	
	//Constructor 
	public Queue() {
		//create dummy node 
		Node<type> node = new Node<>();
		//set as head node
		this.head = node;
		
	}
	
	
	//This method adds a node to the end of the queue 
	//Parameter 1: generic type --- data
	//Returns nothing 
	public void push(type data) {
		//Create node
		Node<type> node = new Node<>((type)data);
		
		//if the queue is empty
		if(this.head.nextNode == null) {
			this.head.nextNode = node;
			this.tail = node;
		}
		else {
			//add it to the end 
			this.tail.nextNode = node;
			this.tail = node;
		}
	}
	
	
	//This method removes the first instance in the queue and returns its data
	//Returns an object with type passed by generic 
	@SuppressWarnings("unchecked")
	public type pop() {
		type returnData = null;
		Node<?> returnNode = null;
		
		//if the queue is not empty 
		if(this.head.nextNode != null) {
			returnNode = this.head.nextNode;
			//point past the first node to delete
			this.head.nextNode = this.head.nextNode.nextNode;
		}
		if(returnNode != null) {
			//get the data to return 
			returnData = (type) returnNode.data;
		}
		
		
		
		return returnData; 
		
	}
	//This method returns the first nodes data
	//Returns the generic type 
	
	@SuppressWarnings("unchecked")
	public type peek() {
		type data;
		Node<?> nodeData = this.head.nextNode;
		data = (type) nodeData.data;
		
		
		
		
		return data;
		
		
	}
	
	
	
	
	//This method is used for testing and converts the queue into a matching array list 
	//returns an array list
	
	@SuppressWarnings("unchecked")
	public ArrayList<type> printAll() {
		Node<?> currNode = this.head.nextNode;
		ArrayList<type> testList = new ArrayList<>();
		
		
		while(currNode != null) {
			System.out.println(currNode.data);
			testList.add((type)currNode.data);
			currNode = currNode.nextNode;
			
			
		}
		
		return testList;
	}

}
