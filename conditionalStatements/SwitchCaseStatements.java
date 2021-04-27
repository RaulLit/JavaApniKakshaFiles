package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int dayOfWeek = 8;
		
//		if (dayOfWeek == 1) {
//			
//		}
//		if (dayOfWeek == 2) {
//			
//		}
//		if (dayOfWeek == 3) {
//			
//		}
//		dayOfWeek = 1;
//		if (dayOfWeek == 4) {
//			
//		}
//		if (dayOfWeek == 5) {
//			
//		}
//		if (dayOfWeek == 6) {
//			
//		}
//		if (dayOfWeek == 7) {
//			
//		}
		
		// it is necessary to put   break;  after the case or else it will keep on 
        // running the code i.e. in this case it will print the other statements too.
		
		// YOUR CODE SHOULD BE DRY(DONT REPEAT YOURSELF)
		
		switch (dayOfWeek) {
		case 1:
			System.out.println("I'm on leave.");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("I'm going to office");
			break;
		case 7: 
			System.out.println("I'm playing football");
			break;
			
			default:
				System.out.println("I don't know what day it is");
		}

	}

}
