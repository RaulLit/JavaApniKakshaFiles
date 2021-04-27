package comparatorsAndComparables;

import java.util.*;

public class MainClass {
	
/*	Comparable Interface imposes a total ordering on the objects of each class that implements it. This ordering is referred to as 
 * 	the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.
 * 	Lists (and arrays) of objects that implements this interface can be sorted automatically by collections.sort (and Arrays.sort).
 * 	Objects that implement this interface can be used as keys in a sorted map or as elements in a sorted set, without the need to 
 * 	specify a comparator.
 */

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Aryan"));
		students.add(new Student(23, "Jeet"));
		students.add(new Student(83, "Dhruv"));
		students.add(new Student(13, "Amit"));
		students.add(new Student(65, "Aditya"));
		students.add(new Student(57, "Jeet"));
		
//		Collections.sort(students);
		
//		Collections.sort(students, new SortByNameThenMarks());	// We passed our own comparator object.
		
		// We can have our own anonymous comparator without making a class. We can do that so by doing the following:
		
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student obj1, Student obj2) {
//				if(obj1.name.equals(obj2)) return obj1.marks - obj2.marks;
//				return obj1.name.compareTo(obj2.name);
//			}
//			
//		});
		
		// With the help of Lambda we could cut short the lines but we have to mention the sign "->".
//		Collections.sort(students,(Student obj1, Student obj2) -> {
		
//		Collections.sort(students,(obj1, obj2) -> {
//				if(obj1.name.equals(obj2)) return obj1.marks - obj2.marks;
//				return obj1.name.compareTo(obj2.name);
//			});
		
//		Collections.sort(students, (obj1, obj2) -> obj1.name.compareTo(obj2.name));
		
//	The comparator SortByNameThenMarks can be written in one line as follows. Also ".reversed()" is used to reverse the order of comparison.
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		students.forEach(System.out::println);	// This is lambda expression to print 
	}
}

//class SortByNameThenMarks implements Comparator<Student> {
//	
//	@Override
//	public int compare(Student obj1, Student obj2) {
//		if(obj1.name.equals(obj2)) return obj1.marks - obj2.marks;
//		return obj1.name.compareTo(obj2.name);
//	}
//}
