package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
//		try {
//		int a = 5; 
//		int b = 0;
//		
//		int c = a/b;
//		System.out.println(c);
		////////////////////////
//		int a[] = new int [5];
//		
//		System.out.println(a[6]);
//		
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage() + " occurred, please check your code");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index should be in the range of 0 to size of array");
//		} catch (IllegalArgumentException e) {
//			System.out.println("Check your casting carefully");
//		} finally {		// Finally block will run even if the exception is thrown or not. 
//			System.out.println("Sorry for the inconvenience");
//		}
//		////////////////////////
//		System.out.println("Very important code that");
//		System.out.println("needs to run.");
//		
		fun1();
	}
	
	static void fun1() {
		int a = 5; 
//		int b = 0;
		int b = 3;
		
		int c = a/b;
		System.out.println(c);
		
//		try {
//		fun2();
//		} catch (Exception e) {
//			System.out.println(e.getMessage() + ", be cautious.");
//		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After delay");
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = false;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger is coming");
		}
	}

}
