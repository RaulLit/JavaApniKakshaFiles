package forLoopsPracticeQuestions;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		for (int i = 1; i <= n; i++) {
			int noOfSpaces = 2*i-1;
			for(int j = 1; j <=n-i+1; j++) {
				System.out.print("* ");
			}
			for (int j =1; j <= noOfSpaces; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
				
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
				int spaces2 = 2*n-2*i+1;
				for (int j =1; j <= i; j++) {
					System.out.print("* ");
				}
				for (int j =1; j <= spaces2; j++) {
					System.out.print("  ");
				}
				for (int j =1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
		}

	}

}
