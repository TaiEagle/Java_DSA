package StackDSA.Stack;

//import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
    /**
     * This tests the stack DS with the Int type
     *
     * 
     */
	//@Test
    void intStackTest(  )
    {
    	
    	Stack<Integer> stack = new Stack<>();
    	
    	stack.push(5);
    	stack.push(9);
    	stack.push(0);
    	int lastNode = stack.peek();
    	int correctVal = 0;
    	
    	//assertTrue(lastNode == correctVal);
    	
    	
    	
       
    }

    /**This tests the stack DS with the String type 
     * 
     */
    public void stringStackTest()
    {
        
    }

 
   
}
