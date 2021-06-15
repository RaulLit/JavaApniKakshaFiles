package forLoopsPracticeQuestions;
import java.util.*;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//THIS QUESTION IS CALLED PASCAL'S TRIANGLE
		for(int i = 0; i <= n; i++) {
			int number = 1;
			for(int j = i; j<n; j++) {
				System.out.print("  ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print(number + "   ");
                		number = number * (i - j) / (j + 1);	//This is what makes it work
            		}
			
			System.out.println();
		}
	}

}
