package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a [] = {2, 4, -1, 5, 7, 8};
		int n = a.length;
		
		for (int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int item: a) {
			System.out.print(item +" ");
		}

	}

}
