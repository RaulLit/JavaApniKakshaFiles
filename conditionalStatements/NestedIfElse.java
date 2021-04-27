package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 13, b = 7, c = 14;
		int result = 0;
		
//		if (a>b) {
//			if (a>c) {
//				result = a;
//			}else { 
//				result = c;
//			}
//		}else {
//			if (b>c) {
//				result = b;
//			}else {
//				result = c;
//			}
//		}
		
		result = a>b ? a>c? a : c : b>c ? b : c;
		
		System.out.println("the greatest number of all is " + result);

	}

}
