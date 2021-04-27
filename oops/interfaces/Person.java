package oops.interfaces;

/*	Interfaces provide specifications that a class (which implements it) must follow.
 * 	Similar to abstract classes, interfaces help us to achieve abstraction in java.
 * 	In java, multiple inheritance is not possible by extending classes. However, a class can implement multiple interfaces. This allows us
 * 	to get the FUNCTIONALITY of multiple inheritance in java.*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*	1. We can't instantiate an interface in java.
 * 	2. Interfaces can't have constructors because we can't instantiate them and interfaces can't have a method with body.
 * 	3. By default any attribute of interface is public, static and final, so we don't need to provide access modifiers to the attributes but
 * 	   if we do, compiler doesn't complain about it either.
 * 	4. By default interface methods are implicitly abstract and public, it makes total sense because the method don't have body and so that 
 * 	   subclasses can provide the method implementation.
 * 	5. An interface can't extend any class but it can extend another interface.
 * 	6. A class implementing an interface must provide implementation for all of its method unless it's an abstract class.*/

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		Person obj = new Person();
		
		obj.study();
		obj.makeVideo();
		obj.editVideo();
		obj.uploadVideo();  // You don't need to override this method since it has been made default, but you can if you want to.
		
//		Youtuber obj = new Youtuber();	Cannot do this because of point 1.
		Youtuber obj1 = obj;		  // But you can do upcasting, obj1 will only have behaviour of Youtuber and cannot access other 
									  // methods of Student or Person.

	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making a video");
	}

	@Override
	public void study() {
		System.out.println("Person is studying");
	}
	
	@Override
	public void editVideo() {
		System.out.println("Person is editing the video");
	}

}
