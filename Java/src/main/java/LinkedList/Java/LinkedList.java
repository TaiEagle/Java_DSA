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
	
	//TODO fix infinite loop
	public Node removeSearch(int data) {
		//empty node
		Node node = null;
		Node currNode = head;
		
		//if the list is empty
		if(currNode == null) {
			return node;
			
		}
		//if it is not empty, search for node
		else {
			//while the next node is not null
			while(currNode.NextNode != null) {
				//if the next node is a match
				if(currNode.NextNode.data == data) {
					return currNode;
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
		//currNode contains the list item BEFORE the list item that will be removed
		Node currNode = removeSearch(data);
		
		//if it is the first node after the dummy node
		if(this.head.NextNode.data == data) {
			this.head.NextNode = currNode.NextNode.NextNode;
		}
		//TODO: does not work --- infinite loop
		//if the next node is the tail
		else if(currNode.NextNode.data == this.tail.data) {
			currNode.NextNode = null;
			tail = currNode;
		}
		// else set current node to next nodes next node
		else {
			currNode.NextNode = currNode.NextNode.NextNode;
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
	
}
