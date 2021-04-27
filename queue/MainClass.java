package queue;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Queue <Integer> q = new LinkedList<>();
		
/*		These methods throw exceptions at their respective operation.
 * 		For example, add() will throw exception if the queue is full and we are trying to add one more element.
 * 					 remove() will throw exception if the queue is empty and we are trying to remove a element.
 * 					 element() will throw exception if the queue is empty and we are trying to see the next exiting element.
 */ 
		
//		q.add(23);
//		q.add(47);
//		q.add(25);
//		
//		int remove = q.remove();
//		
//		int peek = q.element();
//		
//		System.out.println(q);
//		System.out.println(remove);
//		System.out.println(peek);
		
/*		These methods don't throw exception at their respective operation.
 * 		They perform similar operation as of those mentioned above.
 * 		These are, offer() is same as add()
 * 				   poll() is same as remove()
 * 				   peek() is same as element()*/
		
//		q.offer(23);
//		q.offer(47);
//		q.offer(25);
//		
//		int remove = q.poll();
//		int peek = q.peek();
//		
//		System.out.println(q);
//		System.out.println(remove);
//		System.out.println(peek);
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(23);
		mq.enqueue(12);
		mq.enqueue(123);
		mq.enqueue(78);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
	}

}
