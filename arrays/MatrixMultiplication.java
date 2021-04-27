package arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter dimentions of matrix a: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		System.out.println("enter dimentions of matrix b: ");
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		
		if (cols != rows1) {
			System.out.println("Invalid dimentions for matrix multiplication in this code.");
		}else {
			
			int a [] [] = new int [rows] [cols];
			int b [] [] = new int [rows1] [cols1];
			
			System.out.println("enter values of matrix a: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					a [i] [j] = sc.nextInt();
				}
			}
			
			System.out.println("enter values of matrix b; ");
			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < cols1; j++) {
					b [i] [j] = sc.nextInt();
				}
			}
			
			int c [] [] = new int [rows] [cols1];
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols1; j++) {
					c [i][j] = a [i][j] * b [j][i];
				}
			}
			
			System.out.println("The product matrix c is: ");
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols1; j++) {
					System.out.print(c[i][j]+ "  ");
				}
				System.out.println();
			}
			
			
		}

	}

}
