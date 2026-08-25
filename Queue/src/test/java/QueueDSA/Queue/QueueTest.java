package QueueDSA.Queue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class QueueTest {
	//------------------------------------------------------------------------------------------------------------
	//Tests for the Integer type

	@Test
	void INT_AddTest() {
		//fail("Not yet implemented");
		Queue<Integer> queue = new Queue<>();

		queue.push(5);
		queue.push(6);
		queue.push(8);
		queue.push(67);
		queue.push(9);
		
		ArrayList<Integer> testList = new ArrayList<>(queue.printAll());
		ArrayList<Integer> testList2 = new ArrayList<>();
		testList2.add(5);
		testList2.add(6);
		testList2.add(8);
		testList2.add(67);
		testList2.add(9);
		
		
		assertEquals(testList, testList2);
		
		
		
	}
	@Test void INT_QueueDeleteTest(){
		
		//create queue with items
		Queue<Integer> queue = new Queue<>();

		queue.push(5);
		queue.push(6);
		queue.push(8);
		queue.push(67);
		queue.push(9);
		
		//delete items 
		queue.pop();
	
		
		
		//put queue in array list
		ArrayList<Integer> testList = new ArrayList<>(queue.printAll());
		
		//create an array list of what should be contained within the queue 
		ArrayList<Integer> testList2 = new ArrayList<>();
		//testList2.add(5);
		testList2.add(6);
		testList2.add(8);
		testList2.add(67);
		testList2.add(9);
		
		//array lists are equal
		assertEquals(testList, testList2);
		
		
		//delete more from queue
		queue.pop();
		queue.pop();
		queue.pop();
		testList = new ArrayList<>(queue.printAll());
		//delete from array list 
		testList2.remove(0);
		testList2.remove(0);
		testList2.remove(0);
		
		assertEquals(testList, testList2);
		
		//delete more from queue
		queue.pop();
		queue.pop();
		queue.pop();
		testList = new ArrayList<>(queue.printAll());
		
		//delete from array list 
		testList2.remove(0);
		
		assertEquals(testList, testList2);
		
		
	}
	
	
	//This tests the peek method for the Integer type
	@Test
	public void INT_PeekTest() {
		//Integer queue
		Queue<Integer> queue = new Queue<>();

		queue.push(5);
		queue.push(6);
		queue.push(8);
		queue.push(67);
		queue.push(9);
		
		//ArrayList<Integer> testList = new ArrayList<>(queue.printAll());
		//Integer array list to match
		ArrayList<Integer> testList2 = new ArrayList<>();
		testList2.add(5);
		testList2.add(6);
		testList2.add(8);
		testList2.add(67);
		testList2.add(9);
		
		
		assertEquals(queue.peek(), testList2.get(0));
		
	}
	
	
	
	//---------------------------------------------------------------------------------------------------------------
	//Tests for the String type
	
	@Test
	void STRING_AddTest() {
		//fail("Not yet implemented");
		Queue<String> queue = new Queue<>();

		queue.push("Yo");
		queue.push("yoyo");
		queue.push("yoYOYOYO");
		queue.push("YEA");
		queue.push("YOYEAA");
		
		ArrayList<String> testList = new ArrayList<>(queue.printAll());
		ArrayList<String> testList2 = new ArrayList<>();
		testList2.add("Yo");
		testList2.add("yoyo");
		testList2.add("yoYOYOYO");
		testList2.add("YEA");
		testList2.add("YOYEAA");
		
		
		assertEquals(testList, testList2);
		
		
		
	}
	
	@Test void STRING_QueueDeleteTest(){
		
		//create queue with items
		Queue<String> queue = new Queue<>();

		queue.push("Yo");
		queue.push("yoyo");
		queue.push("yoYOYOYO");
		queue.push("YEA");
		queue.push("YOYEAA");
		
		
		//delete items 
		queue.pop();
	
		
		
		//put queue in array list
		ArrayList<String> testList = new ArrayList<>(queue.printAll());
		ArrayList<String> testList2 = new ArrayList<>();
		
		testList2.add("yoyo");
		testList2.add("yoYOYOYO");
		testList2.add("YEA");
		testList2.add("YOYEAA");
		
		//array lists are equal
		assertEquals(testList, testList2);
		
		
		//delete more from queue
		queue.pop();
		queue.pop();
		queue.pop();
		testList = new ArrayList<>(queue.printAll());
		//delete from array list 
		testList2.remove(0);
		testList2.remove(0);
		testList2.remove(0);
		
		assertEquals(testList, testList2);
		
		//delete more from queue
		queue.pop();
		queue.pop();
		queue.pop();
		testList = new ArrayList<>(queue.printAll());
		
		//delete from array list 
		testList2.remove(0);
		
		assertEquals(testList, testList2);
		
		
	}
	
	//this tests the queue peek method
	@Test
	public void STRING_PeekTest() {
		//String queue 
		Queue<String> queue = new Queue<>();

		queue.push("Yo");
		queue.push("yoyo");
		queue.push("yoYOYOYO");
		queue.push("YEA");
		queue.push("YOYEAA");
		
		//ArrayList<String> testList = new ArrayList<>(queue.printAll());
		//matching array list
		ArrayList<String> testList2 = new ArrayList<>();
		testList2.add("Yo");
		testList2.add("yoyo");
		testList2.add("yoYOYOYO");
		testList2.add("YEA");
		testList2.add("YOYEAA");
		
		
		assertEquals(queue.peek(), testList2.get(0));
	}

}
