package recursion;

public class MainClass {
	
/*	There are just 3 steps to solve a problem using Recursion:
 * 1. Base case - Think of the simplest possible input for this function.
 * 2. Find the relation - Think how the larger problem can be solved with the help of the solution of the smaller problem.
 * 3. Generalize - Make a generalized function that solves the problem. Put this all together into a Mathematical function or a Tree.
 * 
 * PROBLEMS
 * 1. Find sum of first N natural numbers using Recursion.
 * 2. Calculate Power using recursion a^b. + Fast Power.
 * 3. Find all the paths in a n x m matrix.
 */
	
	static int stepCount = 0;

	public static void main(String[] args) {
		
//		System.out.println(sum(6));
		
//		System.out.println(pow(3, 10000));
//		System.out.println(stepCount + " steps");
//		stepCount = 0;
//		System.out.println(fastPow(3, 10000));
//		System.out.println(stepCount + " steps");
		
		System.out.println(path(200, 1));
		
	}
	
	static int sum(int N) {
		if(N == 1) return 1;
		return sum(N-1) + N;
	}
	
	static int pow(int a, int b) {
		stepCount++;
		if(b == 0) return 1;
		return pow(a, b-1) * a;
	}
	
	static int fastPow(int a, int b) {
		stepCount++;
		if(b == 0) return 1;
		else if(b%2 == 0) return fastPow(a*a, b / 2);
		return a * fastPow(a, b - 1);
	}
	
	static int path(int rows, int cols) {
		if(rows == 1 || cols == 1) return 1;
		return path(rows - 1, cols) + path(rows, cols - 1);
	}
}
