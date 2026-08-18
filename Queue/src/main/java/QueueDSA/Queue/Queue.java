package QueueDSA.Queue;

import java.util.ArrayList;
public class Queue {
	Node head;
	Node tail;
	
	
	//Constructor 
	public Queue() {
		//create dummy node 
		Node node = new Node();
		//set as head node
		this.head = node;
		
	}
	
	
	//This method adds a node to the end of the queue 
	//Parameter 1: int --- data
	//Returns nothings 
	public void push(int data) {
		//Create node
		Node node = new Node(data);
		
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
	//Returns an integer 
	public int pop() {
		int returnData = -1;
		Node returnNode = null;
		
		//if the queue is not empty 
		if(this.head.nextNode != null) {
			returnNode = this.head.nextNode;
			//point past the first node to delete
			this.head.nextNode = this.head.nextNode.nextNode;
		}
		if(returnNode != null) {
			//get the data to return 
			returnData = returnNode.data;
		}
		
		
		
		return returnData; 
		
	}
	
	
	public ArrayList<Integer> printAll() {
		Node currNode = this.head.nextNode;
		ArrayList<Integer> testList = new ArrayList<>();
		
		
		while(currNode != null) {
			System.out.println(currNode.data);
			testList.add(currNode.data);
			currNode = currNode.nextNode;
			
			
		}
		
		return testList;
	}

}
