package deque;

public class MyDeque <E> {
	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	
	public E removeAtTail() {
		if(tail == null) return null;
		
		Node<E> toRemove = tail;
		
		tail = tail.next;
		tail.prev = null;
		toRemove.next = null;
		
		if(tail == null) head = null;
		
		return toRemove.data;
	}
	
	public void print() {
		Node<E> temp = tail;
		System.out.print("[");
		while(temp.next != null) {
			if(temp.next == null) {
				System.out.print(temp.data + "]");
				break;
			}
			if(temp.next != null) {
				System.out.print(temp.data + ", ");
			}
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.print("]");
	}
	
	public static class Node<E> {
		E data;
		Node<E> next, prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}

}
