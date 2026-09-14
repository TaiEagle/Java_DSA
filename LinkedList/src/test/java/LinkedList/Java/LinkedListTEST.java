package LinkedList.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LinkedListTEST {



	
    /**
     * This test the Int type for the linked list 
     */
    @Test
    public void intTEST() {
    	ArrayList<Integer> testArray = new ArrayList<>();
    	
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(6);
		list.add(3);
		
		list.insert(8, 6, 88);
		
		testArray.add(5);
		//testArray.add(7);
		testArray.add(9);
		testArray.add(8);
		testArray.add(88);
		testArray.add(6);
		testArray.add(3);
		
		
		list.remove(7);
		
		//assertEquals(testArray, )
		Node<?> currNode = list.head.NextNode;
		
		for(Integer item: testArray) {
			assertEquals(item, currNode.data);
			System.out.println("item: " + item + " itemData: " + currNode.data);
			currNode = currNode.NextNode;
			
			
			
		}
		
		

		
		
    }
    
    
    /*
     * This method tests the linked list for error handling to ensure an error is not catastrophic  
     */
    @Test
    public void intErrorTEST() {
    	ArrayList<Integer> testArray = new ArrayList<>();
    	
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(6);
		list.add(3);
		
		//should not insert or cause an error
		list.insert(8, 3, 88);
		list.insert(3, 6, 88);
		
		testArray.add(5);
		testArray.add(7);
		testArray.add(9);
		testArray.add(8);
		//testArray.add(88);
		testArray.add(6);
		testArray.add(3);
		
		//should not remove anything or cause an error
		//list.remove(99);
		
		//assertEquals(testArray, )
		Node<?> currNode = list.head.NextNode;
		
		for(Integer item: testArray) {
			assertEquals(item, currNode.data);
			System.out.println("item: " + item + " itemData: " + currNode.data);
			currNode = currNode.NextNode;
			
			
			
		}
		
    }
    
    
    /*
     * This method tests the linked list with strings 
     */
	@Test
	public void stringTEST() {
		
    	ArrayList<String> testArray = new ArrayList<>();
    	
		LinkedList<String> list = new LinkedList<>();
		list.add("yo1");
		list.add("yo2");
		list.add("yo3");
		list.add("yo4");
		list.add("yo5");
		list.add("yo6");
		
		list.insert("yo4", "yo5", "yo88");
		
		testArray.add("yo1");
		//testArray.add("yo2");
		testArray.add("yo3");
		testArray.add("yo4");
		testArray.add("yo88");
		testArray.add("yo5");
		testArray.add("yo6");
		
		list.remove("yo2");
		
		//assertEquals(testArray, )
		Node<?> currNode = list.head.NextNode;
		
		for(String item: testArray) {
			assertEquals(item, currNode.data);
			System.out.println("item: " + item + " itemData: " + currNode.data);
			currNode = currNode.NextNode;
			
			
			
		}
		
		
	}
    
    
    
    
    /*
     * This method tests the linked list with strings 
     */
	@Test
	public void doubleTEST() {
		
    	ArrayList<Double> testArray = new ArrayList<>();
    	
		LinkedList<Double> list = new LinkedList<>();
		list.add(8.99);
		
		list.add(7.99);
		
		list.add(9.99);
		list.add(11.3);
		list.add(5.05);
		list.add(6.07);
		
		list.insert(11.3, 5.05, 88.88);
		
		testArray.add(8.99);
		//testArray.add("yo2");
		testArray.add(9.99);
		testArray.add(11.3);
		testArray.add(88.88);
		testArray.add(5.05);
		testArray.add(6.07);
		
		list.remove(7.99);
		
		//assertEquals(testArray, )
		Node<?> currNode = list.head.NextNode;
		
		for(Double item: testArray) {
			assertEquals(item, currNode.data);
			System.out.println("item: " + item + " itemData: " + currNode.data);
			currNode = currNode.NextNode;
			
			
			
		}
		
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
