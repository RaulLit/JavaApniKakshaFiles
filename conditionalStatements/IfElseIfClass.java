package conditionalStatements;

public class IfElseIfClass {

	public static void main(String[] args) {
		
//		FORMAT 
//		if (condition) {
//			printing block	
//		}else {printing block}
		
//		int number = 23;
//		
//		if (number <= 10) { 
//			System.out.println("the number is less than 10");
//		}else if (number > 10 && number <= 20) {
//			System.out.println("the number is greater than 10 and less than 20");
//		}else if (number > 20 && number <= 30) {
//			System.out.println("the number is grester than 20 and less than 30");
//		}else {
//			System.out.println("the number is greater than 30");
//		}
		
		int a = 5;
		int b = 3;
		
		int maxOfBothNumbers = a > b ? a : b;
		System.out.println("the max of both numbers is " + maxOfBothNumbers);

	}

}
