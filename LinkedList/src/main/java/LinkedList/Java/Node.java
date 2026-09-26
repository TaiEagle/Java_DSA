/*Creator: Dakota Osborne
 * Date: 08/03/2026
 * This class contains functionality to implement a Node object inside a singly Linked List
 * 
 * */
package LinkedList.Java;

public class Node<type> {
	Node<?> NextNode = null;
	type data;
	
	//Default Constructor
	public Node() {
		//sets data to 0  by default 
	}
	
	
	
	//Constructor
	public Node( type data) {
		
		this.data = data;
	}
	
	
}
