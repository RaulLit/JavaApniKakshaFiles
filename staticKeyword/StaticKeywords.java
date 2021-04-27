package staticKeyword;
import staticKeyword.A.*;

public class StaticKeywords {
	
	static {
		System.out.println("In block 1");	//this is a static block. They are initialized before the main method.
	}
	
	static {
		System.out.println("In block 2");	// They are initialized in the order they are written. In this case first block 1 then 2 will run.
	}

	public static void main(String[] args) {
		// A quick learn about Math keyword.
		// System.out.println(Math.max(23, 17);  will print 23, similarly there are many functions of Math keyword.
		
		// You cannot make a top level class static. You can only make the nested class static.
		// If a nested class is static then it is called static inner class 
		// IF a nested class is not static then it is called inner class
		
		A Obj1 = new A();
		B Obj2 = Obj1.new B();  // Note that I have to import everything first from the class A, Since the class B and C are within class A.
		C Obj3 = new C();		// No need to refer the top level class object when the class is static.

		
		System.out.println("Inside main ");

	}
	static {
		System.out.println("in block 3");
	}

}
