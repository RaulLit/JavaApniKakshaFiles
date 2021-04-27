package practice;

public class Sorting {

	public static void main(String[] args) {
		
		int age [] = new int [4];
		int n = age.length;
		
		age [3] = 1;
		age [2] = 2;
		age [1] = 3;
		age [0] = 4;
		
		for (int i = 0; i < n-1; i++) {
			int minInd = i;
			for (int j = i; j < n; j++) {
				if (age[j] < age[minInd]) {
					minInd = j;
				}
			}
			int temp = age[i];
			age[i] = age[minInd];
			age[minInd] = temp;
		}
		
		for (int item: age) {
			System.out.print(item + " ");
		}
		
		

	}

}
