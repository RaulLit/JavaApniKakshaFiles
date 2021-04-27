package interviewQuestions;
import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int k = 3;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int [] ans = sol.maxSlidingWindow(arr, k);
		
		for(int e: ans) {
			System.out.print(e + " ");
		}
	}
	
	static class Solution{
		public int [] maxSlidingWindow(int [] a, int k) {
			int n = a.length;
			if(n <= 1) return a;
			Deque<Integer> dq = new LinkedList<>();
			int ans[] = new int [n-k+1];
			
			int i = 0;
			for(; i < k; i++) {
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			
			for(; i < n; i++) {
				ans[i-k] = a[dq.peekFirst()];
				
				while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
					dq.removeFirst();
				}
				
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			
			ans[i-k] = a[dq.peekFirst()];
			
			return ans;
		}
	}

}
