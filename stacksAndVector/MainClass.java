package stacksAndVector;

import java.util.Stack;
import java.util.Vector;

public class MainClass {
	
/*	The Vector class is an implementation of the List interface that allows us to create resizable arrays similar to the ArrayList class.
 * 	In Java, both ArrayList and Vector implements the List interface and provides the same functionalities. However, there exist some
 *  differences between them. The Vector class synchronizes each individual operation. This means whenever we want to perform some
 *  operation on vectors, the Vector class automatically applies a lock to that operation making it thread safe(Thread safe means when
 *  there is a multicore processor and multi thread code to be run, at some point of time both thread wants to operate same operation 
 *  at same time. However, in array lists methods are not synchronized.
 * 	It is recommended to use ArrayList in place of Vector because vectors are thread safe and are less efficient.*/
	
	//Size increase factor of ArrayList is 1.5 times and of Vector is 2 times. Which means ArrayList is memory efficient.
	
/*	In Stacks, elements are stored in "Last In First Out" manner. That is, elements are added to the top of the stack and removed from 
 * 	the top of the stack
 * 	Stacks extends Vector class and Vector implements List interface which extends Collection class.
 * 	|Stacks|--extends-->|Vector|--implements-->|List|--extends-->|Collection|*/
	
	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector<>();
//		
//		v.add(23);
//		v.add(48);
		
//		Stack<Integer> stack = new Stack<>();
		MyStack <Integer> stack = new MyStack<>();
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		System.out.println(popped);
		
		int peek = stack.peek();
		System.out.println(peek);

	}

}
