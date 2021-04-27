package practice;
import java.util.*;

public class TwoPointerAlgo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			int n = sc.nextInt();
			int [] a = new int [n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Triplet obj = new Triplet();
			if(obj.findtriplet(a, n)) {
				System.out.println("There is a Triplet");
			}else {
				System.out.println("There is no Triplet");
			}
		}
	}
}
	
class Triplet {
	 public boolean findtriplet(int arr[], int n) {
		 
		 Arrays.sort(arr);		// This "Arrays.sort();" function is found in java.util and sorts a array efficiently.
		 
		 for(int i = 0; i < n - 2; i++) {
			 if(twoSum(arr, -arr[i], i+1)) return true;
		 }
		 
		 return false;
	 }
	 
	 public boolean twoSum(int a[], int x, int i) {
		 int j = a.length - 1;
		 while (i < j) {
			 if(a[i] + a[j] > x) {
				 j--;
			 }else if(a[i] + a[j] < x) {
				 i++;
			 }else {
				 return true;
			 }
		 }
		 
		 return false;
	 }
 }


