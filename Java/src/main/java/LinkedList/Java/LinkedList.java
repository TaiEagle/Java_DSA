/*Creator: Dakota Osborne
 * Date: 08/03/2026
 * This class contains functionality to implement a singly Linked List
 * 
 * */



package LinkedList.Java;

public class LinkedList {
	//head is a dummy node
	Node head = null;
	Node tail = null;
	
	
	//constructor
	public LinkedList() {
		head = new Node();
	}
	
	
	/*This method adds a node to the end of the linked list 
	 * Parameter 1: int 
	 * Returns nothing
	 * */
	public void add(int data) {
		Node listItem = new Node(data);
		//if the list is empty
		if(this.tail == null) {
			this.head.NextNode = listItem;
			this.tail = listItem;
		}
		else {
			this.tail.NextNode = listItem;
			this.tail = listItem;
		}
		
		
	}
	
	
	/*This method searches the Linked List and returns the Node object
	 * Parameter 1: data ---int
	 * This method returns a Node object that comes before the desired Node
	 * **/
	public Node search(int data) {
		//empty node to return outside of conditionals 
		Node node = null;
		
		Node currNode = head.NextNode;
		Node firstNode = currNode;
		//If the list is empty
		if(currNode == null) {
			return null;
		}
		else{
			while(currNode != null) {
				//check if Node equals the parameter 
				if(currNode.data == data) {
					return currNode;
					//return firstNode;
					
				}
				//if it is not the node, set it to the next node
				else {
					firstNode = currNode;
					currNode = currNode.NextNode;
					
				}
			}
		}
		return node;
	}
	

	
	
	
	
	
	
	
	
//This method searches for the node to remove
//Parameter 1: data --- int
//This method returns a node
	public Node removeSearch(int data) {
		//start at the head dummy node
		Node currNode = this.head.NextNode;
		Node prevNode = this.head;
		//if the next node is empty return null
		while(currNode != null) {
			//if the next node is a match
			if(currNode.data == data) {
				return prevNode;
			}
			else {
				currNode = currNode.NextNode;
				prevNode = prevNode.NextNode;
			}
		}
		
		
		return null;
		
	}
	
	
//This method removes a item from the list
//Parameter 1: data --- int
//This method returns nothing
	public void remove(int data) {
		Node removeNode = removeSearch(data);
		//if the list does not contain the desired element
		if(removeNode == null) {
			return;
		}
		
		//if it is the head (Not the dummy node)
		if(removeNode.NextNode == this.head.NextNode) {
			//point past first node to remove the first node
			this.head.NextNode = removeNode.NextNode.NextNode;
		}
		//if it is the tail node
		else if(removeNode.NextNode == this.tail) {
			//point to null
			removeNode.NextNode = null;
			//set new tail
			this.tail = removeNode;
		}
		//if it is in the middle of the list 
		else {
			removeNode.NextNode = removeNode.NextNode.NextNode;
		}
		
		
		
	}
	
	
	
	
	
	/*This method prints out the whole list 
	 * 
	 * Returns nothing
	 * */
	public void printList() {
		//get the head node
		Node currNode = this.head.NextNode;
		
		
		//iterate over list
		
		while(currNode != null)
		 {
			System.out.println(currNode.data);
			currNode = currNode.NextNode;
		}
		//tail does not get printed`
		//System.out.println(currNode.data);
		
		
	}
	
	
	
	//This method inserts a new Node object in between two specified nodes 
	public void insert(int firstNodeData, int secondNodeData, int newNodeData) {
		//first node object
		Node firstNode = search(firstNodeData);
		//second node object
		Node secondNode = search(secondNodeData);
		
		
		//if they are subsequent nodes conduct the insert 
		if(firstNode.NextNode == secondNode) {
			//create new node object 
			Node newNode = new Node(newNodeData);
			
			firstNode.NextNode = newNode;
			newNode.NextNode = secondNode;
			
		}
		//else do nothing
		else {
			return;
		}
		
		

		
	}
	
	
	
}








