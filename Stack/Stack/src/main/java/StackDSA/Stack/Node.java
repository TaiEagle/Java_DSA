package StackDSA.Stack;

public class Node<type>{

	type data =  null;
	Node<?> NextNode = null;
	Node<?> lastNode = null;
	
	//Default constructor 
	Node(){
		
	}
	
	//Constructor 
	//Parameter 1: int ---data
	Node(type data){
		this.data = data;
	}
	
}
