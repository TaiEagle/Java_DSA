package QueueDSA.Queue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Queue queue = new Queue();

		queue.push(5);
		queue.push(6);
		queue.push(8);
		queue.push(67);
		queue.push(9);
		
		ArrayList<Integer> testList = new ArrayList<>(queue.printAll());
		ArrayList<Integer> testList2 = new ArrayList<>();
		testList.add(5);
		testList.add(6);
		testList.add(8);
		testList.add(67);
		testList.add(9);
		
		assertEquals(testList, testList2);
		
	}

}
