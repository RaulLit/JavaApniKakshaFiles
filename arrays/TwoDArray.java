package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
//		int a [] [] = new int [5] [3];
		
		int b [] [] = {
						{3, 4, 4, 2, 5},
						{-34, 5, 6, 7, 9},
						{1, 2, 3, 4, 5}
					  };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i] [j] + "  ");
			}
			System.out.println();
		}
		

	}

}
