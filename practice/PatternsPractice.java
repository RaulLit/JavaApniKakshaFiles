package practice;
import java.util.Scanner;

public class PatternsPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
				// Pattern 1
		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
				// Pattern 2
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j<= i-1; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
				// Pattern 3
		
//		for (int i = 1; i <= n; i++) {
//			for (int j =1; j<= n-i; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j<= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
				// Pattern 4
		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
