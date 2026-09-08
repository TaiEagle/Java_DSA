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
		testArray.add(7);
		testArray.add(9);
		testArray.add(8);
		testArray.add(88);
		testArray.add(6);
		testArray.add(3);
		
		//assertEquals(testArray, )
		Node<?> currNode = list.head.NextNode;
		
		for(Integer item: testArray) {
			assertEquals(item, currNode.data);
			System.out.println("item: " + item + " itemData: " + currNode.data);
			currNode = currNode.NextNode;
			
			
			
		}
		
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
