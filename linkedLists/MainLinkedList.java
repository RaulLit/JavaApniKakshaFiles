package linkedLists;

import java.util.LinkedList;

public class MainLinkedList {
	
/*	Linked List are linear data structures where the elements are not stored in contiguous locations and every element is a separate
 *  object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. 
 *  Due to dynamicity and ease of insertions and deletions, they are preferred over the arrays.
 * 
 * It also has few disadvantages like the nodes cannot be accessed directly instead we need to start form the head and 
 * follow through the link to reach to a node we wish to access.*/

	public static void main(String[] args) {
		
		//All the methods of ArrayList are also present in LinkedList. Example: add(), get(), size(), etc.
		
//		List<Integer> ll = new LinkedList<>();
//		ll.add(23);
//		ll.add(24);
//		ll.add(55);
//		
//		ll.set(2, 13);
//		
//		System.out.println(ll.get(1));
		

		
//////////////////////////////////////////////////////////////////////////////////////////////////
		
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);
		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			myLL.add(i + " added");
		}
		myLL.get(3);
		myLL.print();
		
	}
	
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();	// Is used to get the current time in milliseconds.
//		
//		for(int i = 0; i < 100000; i++) {
//			list.add(0, i);
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + " ===> " + (end - start));
//		
//	}

}
