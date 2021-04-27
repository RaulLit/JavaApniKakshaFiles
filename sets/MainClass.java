package sets;

import java.util.*;

public class MainClass {
	
	//The add() method returns boolean. It returns true if an element is added to a collection & returns false if it is not added.
	// Set is like the mathematical set function. It does not allow duplicate elements.

	public static void main(String[] args) {
		
/* 		HashSet uses hash map to execute operations.
 * 		HashSets uses less time to execute different operation such as deletion, addition, contains, etc.
 * 		It has constant time complexity since it uses "hash function" to execute the operations.
 */
		
//		Set<String> fruits = new HashSet<>();
//		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		
//		System.out.println(fruits.add("Kiwi"));
//		
//		System.out.println(fruits.add("Banana"));
//		
//		System.out.println(fruits);
		
/* 	LinkedHashSet uses LinkedList to store elements and we know that LinkedList stores element in sequential order.
 * 	Though LinkedHashSet has the same underline principle that there will be no duplicate elements in it.
 * 	Since it uses LinkedList its time complexity is linear and uses LinkedList methods.
 */		
//		Set<String> fruits = new LinkedHashSet<>();
//		
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		fruits.add("Apple");
//		
//		System.out.println(fruits);
		
/*	TreeSet uses tree map to execute operations.
 * 	TreeSet is used when you need to store elements in sorted way.
 */		
//		Set<String> fruits = new TreeSet<>();
//		
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		fruits.add("Apple");
//		
//		System.out.println(fruits);
		
/////////////////////////////////////////////////////////////////////////////////////////////
		
/*		NOW WE WILL SEE SOME OPERATIONS OF SET
 * 	Union :- to get the union of two set x and y, we can use x.addAll(y);
 * 	Intersection :- to get the intersection of two set x and y, we can use x.retainAll(y);
 * 	Subset :- to check if x is a subset of y, we can use y.containsAll(x);
 */
//		Set<Integer> x = new HashSet<>();
//		
//		x.add(12);
//		x.add(1);
//		x.add(34);
//		
//		Set<Integer> y = new HashSet<>();
//		
//		y.add(24);
//		y.add(1);
//		y.add(3);
//		
//		x.addAll(y);		// now replace addAll with retainAll to perform intersection operation.
//		System.out.println(x);
		
///////////////////////////////////////////////////////////////////////////////////////
		
		// To check if a set is a subset of another set we use containAll method.
		
		Set<Integer> x = new HashSet<>();
		
		x.add(12);
		x.add(1);
		x.add(34);
		
		Set<Integer> y = new HashSet<>();
		
		y.add(1);
		
		System.out.println(x.containsAll(y));
		
	}

}
