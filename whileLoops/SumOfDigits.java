package whileLoops;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while (temp > 0) {
			int lastDigit = temp % 10; 
			temp /= 10;
			sum += lastDigit;
			
			// To understand what exactly is going on, uncomment the following code block
			// System.out.println(last digit + "  " + temp + "  " + sum);
		}
		System.out.println("The sum of the digits of number " + n + " is "+ sum);
		
		// NO. OF DIGITS CAN ALSO BE FOUND USING THE FOLLOWING
		//int numberOfDigits = (int)Math.log10(n) + 1;
		//System.out.println(numberOfDigits);
	}

}
