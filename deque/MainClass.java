package deque;

import java.util.*;

public class MainClass {
	
/*	ArrayDeque (Or Array doubly ended queue) has many methods/functions. It has functions of Stack as well as of queue which means you can
 * 	implement both of them using ArrayDeque. ArrayDeque is likely to be faster than Stack class because Stack is thread safe and ArrayDeque
 *  is not. The Stack class extends Vector class which is thread safe and thus makes it slower then ArrayDeque because of synchronizing.
 * 	Methods of Stack are: push(), pop() and peek().
 * 	Methods of Queue are: add(), offer(), remove(), poll(), element() and peek().
 *  Methods of ArrayDeque are: offerFirst(e), addFirst(e) | pollFirst(), removeFirst() | peekFirst((), getFirst() | offerLast(e), addLast(e)|
 *  						   pollLast(), removeLast() | peekLast(), getLast() |
 *	It also has the methods of Collection class, since it is in collection framework and indirectly extends the Collection class.*/

	public static void main(String[] args) {
		//ArrayDeque implement Deque and Deque extends Queue. Thus you can write Queue<Integer> ad = new ArrayDeque<>();
//		ArrayDeque <Integer> ad = new ArrayDeque<>();
		
//		ad.add(23);
//		ad.add(12);
//		ad.add(34);
//		
//		System.out.println(ad.remove());
//		System.out.println(ad.peek());
		
		//It can also be used as Stack as mentioned earlier.
		
//		ad.push(12);
//		ad.push(23);
//		ad.push(34);
//		
//		System.out.println(ad.pop());
//		System.out.println(ad.peek());
		
		MyDeque<Integer> md = new MyDeque<>();
		
		md.addToHead(12);
		md.addToHead(23);
		md.addToHead(34);
		
		md.removeAtTail();
		
		md.print();

	}

}
