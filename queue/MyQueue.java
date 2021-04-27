package queue;

import linkedLists.MyLinkedList.Node;

public class MyQueue <E>{
	
	private Node<E> head, tail;
	
	public void enqueue(E add) {
		Node<E> toAdd = new Node<>(add);
		
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		
		tail.next = toAdd;
		tail = tail.next;
		
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		return temp.data;
	}

}
