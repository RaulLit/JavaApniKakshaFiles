package methods;

public class Introduction {

	public static void main(String[] args) { 	 // this is also a method, the execution of the code starts from here.
		
		int firstNumber = 34;
		int secondNumber = 12;
		
		int result = maxOf(firstNumber, secondNumber);
		System.out.println(result);
		
		maxOf(29.7f, 30);  // you can press control button and click on the method name to see it's declaration(i.e the location where the code is)
		System.out.println(maxOf(29.4f, 40));
	}		
	
	// So as to call a method in public static void main method, the method should contain the key word "static" in it too 	
	
	static int maxOf(int a, int b) {  // this is a method
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	// you can make different methods of same name but the parameters of each another method should be different 
	static float maxOf(float a, int b /* or even float b*/) {  
		 return  b<a ? b: a;
	}
	
	
	static void sayHi() {
		System.out.println("Hi");
	}

}
