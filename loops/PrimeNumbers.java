package loops;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < n; i++) {
			if (n%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (n<2) isPrime = true;  // {} for multiple lines of code, otherwise this can be used
		
		System.out.println("isPrime " + isPrime);
		
		// THE NEXT ONE WRITING BELOW TAKES LESS TIME TO EXECUTE
		// NOTE THE SECOND STATEMENT OF THE FOR LOOP
/* 
 * 		int n = sc.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i * i <= n; i++) {
			if (n%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (n<2) isPrime = true;  // {} for multiple lines of code, otherwise this can be used
		
		System.out.println("isPrime " + isPrime);
 *  
 *  */

	}

}
