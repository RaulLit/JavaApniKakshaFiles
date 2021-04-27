package sets;

import java.util.*;

/*  
 *  Given an array, find if there exists a subarray with sum equals to zero.
 *  n < 10^5
 */

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		// This is the basic approach but the time limit will be exceeded.
		
//		int a[] = {2, 1, 3, 4, -2};
//		boolean found = false;
//		
//		for(int i = 0; i < a.length; i++) {
//			int sum = 0;
//			for(int j = i; j < a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
//		
//		System.out.println("Found " + found);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Now we will see how sets is used to decrease the time needed to execute the code. But using sets, it will takes more space.
		
		int a[] = {2, 1, 3, -4, -2};
		boolean found = false;
		
		// if we were to find a specific sum lets say k = 6, then you have to do what is written in comment 1.
//		int k = 6;
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int e: a) {
			set.add(sum);
			sum += e;
			if(set.contains(sum)) {  // Comment 1: change set.contains(sum) to set.contains(sum-k)
				found = true;
				break;
			}
		}
		
		System.out.println("Found " + found);
		

	}

}
