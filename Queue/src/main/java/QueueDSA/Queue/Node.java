package QueueDSA.Queue;

public class Node<type> {

	
	Node<?> nextNode = null;
	type data;
	
	//Constructor 
	public Node() {
		
	}
	
	//Constructor 
	public Node(type data) {
		this.data = data;
		}
}
