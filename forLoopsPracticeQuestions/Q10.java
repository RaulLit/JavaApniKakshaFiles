package forLoopsPracticeQuestions;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i =1; i<= n-1; i++) {
			for (int j =1; j <= n-i; j++) {
				System.out.print("  ");
			}
				System.out.print("*");
			
			for (int j = 1; j <= 2*i-3; j++) {
				System.out.print(" ");
			}
			if (i > 1) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for (int j =1; j <= n; j++) {
			System.out.print("* ");
		}
		
	}

}
