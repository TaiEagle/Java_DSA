/*Creator: Dakota Osborne
 * Date: 08/03/2026
 * This class contains functionality to implement and test a singly Linked List
 * 
 * */

package LinkedList.Java;

public class Driver {
	public static void main(String[] args) {
		System.out.println("yoyo");
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(6);
		list.add(3);
		
		
		
		list.printList();
		
		list.insert(8, 6, 88);
		//list.remove(3);
		System.out.println("\n");
		list.printList();
	}
}
