package LinkedList.Java;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * This test the Int type for the linked list 
     */
    @Test
    public void shouldAnswerWithTrue() {
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
		
		assertEquals(testArray, )
		
    }
}
