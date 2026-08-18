package QueueDSA.Queue;

public class QueueDriverTest {


	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.push(5);
		queue.push(6);
		queue.push(8);
		queue.push(67);
		queue.push(9);
		
		//queue.pop();
		
		queue.printAll();
		System.out.println();
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println();
		queue.printAll();
	}

	
	
	
	
}
