package oops.finalKeyword;

public class MainClass {
//extends Student{			// Cannot extend a class when the class is made final
	
/*		A final variable can only be initialized once.
 * 		We must initialized a final variable, otherwise compiler will through compile-time error.
 * 		It is a good practice to name final variable in all CAPS
 * 		A final variable is called blank final variable, if it is not initialized while declaration
 * 		In case of a reference final variable, internal state of the object pointed by that reference variable can be changed. */
	
//	final int ROLL_NO = 4;
	
//	public void getDescription() {		          // Cannot override a method when the method is made final
//		System.out.println("Inside main class");
//	}

	public static void main(String[] args) {
		
//		final String name = "Aditya";
		
		final String name;		// A local variable is a variable which is under a method.(i.e which is not directly under a class)
		
		
//		System.out.println(name);		any variable should be initialized first before using it.
		
		final Student obj1 = new Student();
		Student obj2 = new Student();
		
//		obj1 = obj2;	Cannot give reference when a obj is final.
		
		obj1.name = "Aditya";
		obj1.rollNo = 4;		// the internal changes can still be done when a obj is final only reference cannot be done.
		
//		obj1.getDescription();
	}

}
