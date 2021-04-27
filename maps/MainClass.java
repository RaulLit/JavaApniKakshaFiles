package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {
	
/*	In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values. A map cannot
 *  contain duplicate keys. And, each key is associated with a single value.
 * 	We can access and modify values using the keys associated with them.
 * 	Since map is an interface, we cannot create object from it. In order to use the functionalities of the map interface, we can use these 
 * 	use these classes: HashMap; EnumMap; LinkedHashMap; WeakHashMap; TreeMap;
 * 	
 * 	HashMap uses an array table to store its key value pairs. Each element of the array holds the head of a LinkedList to avoid collision.
 * 	The hash of every key is calculated and the elements are placed in the array using this hash function.
 * 	
 * 	The modulus of hash function number to size of array table(i.e. hashFunctionNumber % sizeOfArrayTable) will give us the place 
 * 	where to put this key and value.
 * 	When for two keys we get the same hash function value, we call it collision.
 * 	Chaining technique is used to tackle collision.
 * 	There is a array of LinkedList which is called array table. When implementation of HashMap, when the constructor is called,
 * 	by default the size of the array table is 16 and the load factor is 0.75.
 * 	To explain load factor lets say there is a array table of 16 and key value pairs have been stored till 11, and when we add another 
 * 	element at place 12, the array table doubles its size. So, load factor multiplied by size of array table tells us at which point 
 * 	the table will double it size. 
 * 	When the size of the array table is doubled, we need to rehash all the key which was stored before.
 * 	Collision can be avoided by optimizing hash function or by increasing the size of array table.
 */

	public static void main(String[] args) {
		
		// Methods of Map
		
/*	put(K, V) - Inserts the association of the key K and a value V into the map. If the key is already present, the new value replaces
 * 	the old value.	
 * 
 *	putAll() - Inserts all the entries from the specified map to this map.
 *
 *	putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
 *
 *	get(K) - Returns the value associated with the specifies key K. If the is not found. it returns null.
 *
 *	getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns 
 * 	the defaultValue.
 * 
 *	containsKey(K) - Checks if the specified key K is present in the map or not.
 *	
 *	containsValue(V) - Checks if the specified value V is present in the map or not.
 *	
 *	replace(K, V) - Replace the value of the key K with the new specified value V.
 *	
 *	replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated 
 *	with the value oldValue.
 *
 *	remove(K) - Removes the entry from the map represented by the key K.
 *
 *	remove(K, V) - Removes the entry from the map that has key K associated with value V.
 *
 *	keySet() - Returns a set of all the keys present in a map.
 *
 *	values() - Returns a set of all the values present inn a map.
 *	
 *	entrySet() - Returns a set of all the key/value mapping present in a map.
 */
		
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one", 1);	// null key is also supported
		numbers.put("two", 2);
		numbers.put("five", 5);
		
		numbers.put("one", 10);	// This will replace the value of key one.
		
		numbers.putIfAbsent("two", 20);
		
		numbers.remove("five");
		numbers.remove("one", 2);
		
		System.out.println(numbers);
		
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
//		System.out.println(numbers.get("two"));	// get method will return null if the key is not present.
//		System.out.println(numbers.containsKey("five"));
//		System.out.println(numbers.containsValue(3));
		
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() * 100);
		}
		
		System.out.println(numbers);

	}
	// This is a sample of hash function.
	public static int getHash(String s) {
		int hash = 0; 
		for(int i = 0; i < s.length(); i++) {
			hash += s.charAt(i);		// s.charAt(i) will give ascii values of the characters of string s.
		}
		return hash;
	}

}
