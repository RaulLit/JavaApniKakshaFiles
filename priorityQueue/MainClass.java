package priorityQueue;

import java.util.*;

public class MainClass {
	
/*	A priority queue is a special type of queue in which each element is associated with a priority and is served according to its priority.
 * 	If elements with the same priority occur, they are served according to their order in the queue.
 * 	In a queue, the First-In-First-Out rule is implemented whereas, in a priority queue, the values are removed on the basis of priority. 
 * 	The element with the highest priority is removed first.
 * 	Since it implements Queue it has the methods of Queue interface such as add, remove, element, offer, etc.
 *	When you put elements in PriorityQueue they are not put in sorted order but when you remove the elements they come out in sorted order.
 **/

	public static void main(String[] args) {
		
//		PriorityQueue <String> pq = new PriorityQueue<>();
//		
//		pq.add("Apple");
//		pq.add("Mamgo");
//		pq.add("Banana");
//		pq.add("Kiwi");
//		
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		//	EXAMPLE 2
		
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		
		pq.add(23);
		pq.add(1);
		pq.add(100);
		pq.add(43);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		ArrayList <Integer> arr = new ArrayList<>();
		
		Collections.sort(arr, Collections.reverseOrder()); 		// This helps in sorting a ArrayList in reverse order.
		

	}

}
