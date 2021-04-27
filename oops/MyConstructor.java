package oops;

class vehicle {   /* if a constructor has no parameters then it is called no-arg constructor */
	int wheels;
	int headLight;
	String color;
	
//	vehicle() {		// compiler make a default constructor which take all the variable and assign them the default values
//		wheels = 4;		// like false for boolean, zero for int, will point null for a object, etc.
//	}
	
	vehicle(int wheels) {	   // "this" keyword takes the reference of the variable at of making it. 
		this.wheels = wheels;  // this keyword helps when you want same name for a parameter to that of a variable.
		headLight = 2;
	}
	
	vehicle(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
		headLight = 2;
	}
	
	vehicle() {
		
	}
}

public class MyConstructor {  
	
	MyConstructor() {
		System.out.println("the obj is created.");
	}

	public static void main(String[] args) {
		
		vehicle car = new vehicle(4);
		vehicle scooty = new vehicle(2);
		
		vehicle eRickshaw = new vehicle(3, "Yellow");
		vehicle random = new vehicle();		// when you make a constructor of your own then you cannot call the default constructor.
											// but you can make a default constructor.
		
		System.out.println(scooty.wheels + " wheels and color is " + eRickshaw.color);
		
	}

}
