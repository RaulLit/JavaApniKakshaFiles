package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
//		int number = 45;
//		
//		if (number >= 1 && number <= 100) {      // you can also use bitwise & the only difference is it will check both the cases.
//			System.out.println("the number is in the range.");
//		}
//		
		
//		int grade = 11;
//		
//		if (grade == 10 || grade == 12) {
//			System.out.println("You can give board now.");
//		}
		
		int grade = 11;
		
		if (!(grade == 10 || grade == 12)) {
			System.out.println("You cannot give boards now.");
		}else { System.out.println("You can give the boards this year."); }

		System.out.println((1 ^ 0) % 2);
	}

}
