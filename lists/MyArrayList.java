package lists;
import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		
//		ArrayList fruits = new ArrayList();
//
//		fruits.add("Apple");
//		fruits.add(132);
//		
//		System.out.println(fruits);
		
/*		When you specify the type of the input(DataType) using "<DataType>" only those type of input can be made in that List, Class, etc.
 * 		For example, in the fruits ArrayList below it is specified that the list will contain only String input, so when we try to add
 * 		integer input it shows error at compile time.
 * 		In the "<>" the first letter of the data type should be capital. For example you cannot write int in those brackets, you should
 * 		write Integer. Similarly, Short, Double, Long, etc. and not short, double, long*/
		
//		ArrayList<String> fruits = new ArrayList<>();	//This is called Generics.
		
//		fruits.add(234);	//an error will show cuz the type is String
		
//		Pairs<String, Integer> p1 = new Pairs<>("Aditya", 123);
//		Pairs<String, Boolean> p2 = new Pairs<>("Cake", true);
//		
//		p1.getDescription();
//		p2.getDescription();
		
//		ArrayList<String> fruits = new ArrayList<>();
													// You can upcast and make an obj reference of List interface and hence can easily 
		List<String> fruits = new LinkedList<>();	// change the type of list you want to use if needed.
													// Since List is an interface and ArrayList is an class.
		
//		***obj.add();***  method helps to add elements to the dynamic array or ArrayList.
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		System.out.println(fruits);
		
//////////////////////////////////////////////////////////////////////////////////
		
/*		***obj.addAll();*** method is used to add a collection into another collection.
 *		Also when adding items of LinkedList to ArrayList or vice versa, there will be no problem since
 *		both are List at the top level.*/
		
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		List<String> vegetable = new ArrayList<>();
//		vegetable.add("Potato");
//		vegetable.add("Tomato");
//		vegetable.add("Carrot");
//		
//		fruits.addAll(vegetable);
//		
//		System.out.println(fruits);
		
//////////////////////////////////////////////////////////////////////////////

/*		***obj.get();*** method is used to get an element in the list using zero based indexing.
 * 		If the index is out of range of the ArrayList then it will throw IndexOutOfBoundException*/
		
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		System.out.println(fruits.get(1));
//		System.out.println(fruits.get(23));		// this will show index out of bound exception since the the arraylist is of range 0 to 2;
		
//////////////////////////////////////////////////////////////////////////////
		
/*		***obj.set();*** method is used to replace or update an element in the list*/
//
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		fruits.set(2, "Berry"); 	// "Hi" will be replaced by "Berry".
//		
//		System.out.println(fruits);
		
//////////////////////////////////////////////////////////////////////////////
		
/*		***obj.remove();*** method is used to remove a element from the list*/
//
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		fruits.remove(2);
//		
//		System.out.println(fruits);
		
///////////////////////////////////////////////////////////////////////////////
		
/*		***obj.clear();*** method is used to remove all the elements of a collection or list.*/
		
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		fruits.clear();
//		
//		System.out.println(fruits);
		
////////////////////////////////////////////////////////////////////////////////
		
/*		***obj.removeAll();*** method is used to remove specific elements in the collect/list.
 * 		We need to pass another collection/list that contains the elements that we need to remove from the main list.*/

//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		ArrayList <String> toRemove = new ArrayList<>();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
//		
//		fruits.removeAll(toRemove);	
//		
//		System.out.println(fruits);
		
////////////////////////////////////////////////////////////////////////////////
		
/*		***obj.size();*** method is used to get the length or size of the ArrayList/Collection/List.
 * 		It's return type is int.*/
		
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		System.out.println(fruits.size());
		
/////////////////////////////////////////////////////////////////////////////////
		
/*		***obj.contains();*** method is used to check whether a specific element exists in the list or not.
 * 		It's return type is boolean.*/
		
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		System.out.println(fruits.contains("Hi"));
		
//////////////////////////////////////////////////////////////////////////////////
		
/*		***obj.isEmpty();*** method is used to know whether a list is empty/zero or not.
 * 		It's return type is boolean.*/
		
//		fruits.add("Orange");
//		fruits.add("Apple");
//		fruits.add("Hi");
//		
//		System.out.println(fruits.isEmpty());
		
/////////////////////////////////////////////////////////////////////////////////
		
/*		***obj.toArray();*** method is used to convert a list into array.
 * 		Method overloading is done in this function/method.
 * 		First one is simple obj.toArray(); where there is no need to pass the array parameter in it, it gives array of the object.
 * 		Second one is obj.toArray(parameter); where we will need to pass an array to get the array of required data type.*/
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Hi");
		
		String arr[] = new String[fruits.size()];
		
		fruits.toArray(arr);
		
		for(String e: arr) {
			System.out.println(e);
		}

	}

}
