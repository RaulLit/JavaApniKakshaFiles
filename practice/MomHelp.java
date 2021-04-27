package practice;
import java.util.Scanner;

public class MomHelp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of tests attempted by the student: ");
		int noOfTests = sc.nextInt();
		
		if (noOfTests == 1) {
			int marks [] = new int [noOfTests];
			System.out.println("Enter marks: ");
			for (int i = 0; i < noOfTests; i++) {
				marks[i] = sc.nextInt();
			}
			
			int average = 0;
			
			for (int i = 0; i < noOfTests; i++) {
				average += marks[i];
			}
			float result = (float) average / 5;
			
			System.out.println("Your average marks are: " + result);
		}
		
		if (noOfTests == 2) {
			int marks [] = new int [noOfTests];
			System.out.println("Enter marks: ");
			for (int i = 0; i < noOfTests; i++) {
				marks[i] = sc.nextInt();
			}
			
			int average = 0;
			
			for (int i = 0; i < noOfTests; i++) {
				average += marks[i];
			}
			float result = (float) average / 10;
			
			System.out.println("Your average marks are: " + result);
		}
		
		if (noOfTests == 3) {
			int marks [] = new int [noOfTests];
			System.out.println("Enter marks: ");
			for (int i = 0; i < noOfTests; i++) {
				marks[i] = sc.nextInt();
			}
			
			int average = 0;
			
			for (int i = 0; i < noOfTests; i++) {
				average += marks[i];
			}
			float result =(float) average / 15;
			
			System.out.println("Your average marks are: " + result);
			
		}
	}

}
