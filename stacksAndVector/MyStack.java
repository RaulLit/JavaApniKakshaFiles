package stacksAndVector;

import linkedLists.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E data) {
		ll.add(data);
	}
	
	public E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from an empty stack is not allowed.");
		}
		return ll.removeLast();
	}
	
	public E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeking from an empty stack is not allowed.");
		}
		return ll.getLast();
	}
 
}
