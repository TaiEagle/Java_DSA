package LinkedList.Java;

public class Driver {
	public static void main(String[] args) {
		System.out.println("yoyo");
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(7);
		list.add(9);
		list.printList();
		list.remove(9);
		System.out.println("\n");
		list.printList();
	}
}
