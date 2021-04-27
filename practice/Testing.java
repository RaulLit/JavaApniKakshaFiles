package practice;

import java.util.*;

public class Testing {
	
	static Scanner sc = new Scanner(System.in);
	static String input;
	
	public static void add(long n1, long n2) {
		System.out.println(n1 + n2);
	}
	public static void subtract(long n1, long n2) {
		System.out.println(n1-n2);
	}
	public static void multiply(long n1, long n2) {
		System.out.println(n1*n2);
	}
	public static void divide(long n1, long n2) {
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) {
			input = sc.nextLine();
			if(input == "Hi" || input == "hi") {
				System.out.println("Hi, I am chota bheem. A bot made by Aditya.");
				System.out.println("Tell me operation to perform and numbers for the same.");
			}
			String operation = sc.nextLine();
			if(operation == "Add" || operation == "Addition" || operation == "add") {
				long N1 = sc.nextLong(), N2 = sc.nextLong();
				add(N1, N2);
			} else if(operation == "Subtract" || operation == "subtract") {
				long N1 = sc.nextLong(), N2 = sc.nextLong();
				subtract(N1, N2);
			} else if(operation == "Multiply" || operation == "multiply" || operation == "Multiplication" || operation == "multiplication") {
				long N1 = sc.nextLong(), N2 = sc.nextLong();
				multiply(N1, N2);
			} else if(operation == "Divide" || operation == "divide" || operation == "Division" || operation == "division") {
				long N1 = sc.nextLong(), N2 = sc.nextLong();
				divide(N1, N2);
			}
		
	}
}