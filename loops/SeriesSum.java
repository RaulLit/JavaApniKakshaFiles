package loops;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float result = 0;
		
// For the series 1+1/2+1/3+1/4+1/5+....n
		
//		for (float i = 1; i <= n; i++) {
//			result += 1/i;
//		}
//		System.out.println(result);
		
		
// For the series 1-1/2+1/3-1/4+1/5-....n
		
		for (float i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				result -= 1/i;
			}else {
				result += 1/i;
			}
		}
		System.out.println(result);

	}
}
