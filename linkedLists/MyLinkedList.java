package linkedLists;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<>(data);
		
		if (isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public E removeLast() throws Exception{
		 
		if(head == null) {
			throw new Exception("Cannot remove element from an empty list.");
		}
		
		if(head.next == null) {
			 Node<E> toRemove = head;
			 head = null;
			 return toRemove.data;
		}
		
		Node<E> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
		
	}
	
	public E getLast() throws Exception {
		Node<E> temp = head;
		 
		if(temp == null) {
			throw new Exception("Connot get last element from an empty list.");
		}
		
		if(temp.next == null) {
			return temp.data;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void get(int index) {
		
		if(head == null) {
			System.out.println("Cannot get a element from an empty list.");
		}
		
		if(head.next == null) {
			System.out.println(head.data);
		}
		try {
			Node<E> temp = head;
			for(int i = 0; i < index -1; i++) {
				temp = temp.next;
			
			System.out.println(temp.data);
			}
		} catch (Exception e){
			System.out.println("Index out of range");
		}
	}
	
	public void print() {
		Node<E> temp = head;
		System.out.print("[");
		while(temp != null) {
			if(temp.next != null) {
				System.out.print(temp.data + ", ");
			}else {
				System.out.print(temp.data);
			}
			temp = temp.next;
		}
		System.out.println("]");
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		} else {
			return false;
		}
		// The above four code can also be written as ==> return head == null;
		// Since the operator "==" returns boolean. So if head is equal to null then that operation will return true otherwise false.
	}

	static public class Node<E> {
		public E data;
		public Node<E> next; 
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

}
