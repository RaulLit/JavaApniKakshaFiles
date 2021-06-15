package forLoopsPracticeQuestions;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i <= n+1; i++) {
			//Right side till column 0
			for (int j =1; j<= n-i+1; j++) {
				System.out.print("  ");
			}
			if(i>1) {
				for (int j = n-i+2; j <= n; j++) {
					System.out.print(j + " ");
				}
			}
			System.out.print(0 + " ");
			//Left side after column 0
			if(i>1) {
				for (int j = n; j >= n-i+2; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
	}
}
