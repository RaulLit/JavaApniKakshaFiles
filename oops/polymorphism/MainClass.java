package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		// This is called dynamic or runtime polymorphism. What is referring what is known at run time.
		
		Dog d = new Dog();
		
		Pet p = d;
		Animal a = d;
//		
//		d.walk();		/*The result comes out to be "Dog is walking" two times since p is referring the object of Dog class*/
//		p.walk();
//		a.walk();	// will show error because there is no walk method in Animal class.
		
		//Overriding is possible for methods only. Variables cannot be override.
		
		System.out.println(d.name);
		System.out.println(p.name);
		
//////////////////////////////////////////////////////////////////////////////////////////
		
//		greetings();
//		greetings("Hello");
//		greetings("Good Morning", 3);
		
	}		
	
	//This is called compile time or static polymorphism. Knows what is calling what at compile time.
	
	public static void greetings () {
		System.out.println("Hi, there");
	}
	
	public static void greetings (String s) {
		System.out.println(s);
	}
	
	public static void greetings (String s, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
	/* In short overriding is dynamic polymorphism and overloading is static polymorphism.*/
	
}
