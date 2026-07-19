package LinkedList.Java;

public class LinkedList {
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
			this.tail = listItem;
			this.head = listItem;
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
					return firstNode;
					
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
	
	
	
	
	/*This method removes the first node from the Linked List that contains the specified data
	 * Parameter 1: data --- int
	 * Returns nothing
	 * */
	public void remove(int data) {
		
	}
	
	/*This method prints out the whole list 
	 * 
	 * Returns nothing
	 * */
	public void printList() {
		//get the head node
		Node currNode = this.head;
		
		//if the list is empty return 
		if(this.tail == null) {
			return;
		}
		//iterate over list
		
		while(this.tail != currNode)
		 {
			System.out.println(currNode.data);
			currNode = currNode.NextNode;
		}
		//tail does not get printed`
		System.out.println(currNode.data);
		
		
	}
	
}
