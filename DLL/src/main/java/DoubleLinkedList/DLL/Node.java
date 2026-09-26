package DoubleLinkedList.DLL;

public class Node<type> {
	
	Node<?> nextNode = null;
	Node<?> lastNode = null;
	type data = null;
	
	//default constructor
	public Node() {
		
	}
	
	//constructor
	public Node(type data, Node<?> nextNode, Node<?> lastNode) {
		this.nextNode = nextNode;
		this.lastNode = lastNode;
		this.data = data;
	}
	
}
