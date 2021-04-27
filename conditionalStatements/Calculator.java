package conditionalStatements;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		
		System.out.println("Enter your second number");
		int b = sc.nextInt();
		
		int result = 0;
		
		System.out.println("Enter your operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		switch (operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '/':
			result = a / b;
			break;
		case '*':
			result = a * b;
			break;
			
			default:
				System.out.println("Invalid Input");
		}
		
		System.out.println("the result is " + result);

	}

}
