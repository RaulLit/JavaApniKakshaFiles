package loops;

public class ForLoops {

	public static void main(String[] args) {
		
//		for ( int i=0; i < 100; i = i + 1) {
//			System.out.println("Hello World " + i);
//		}
//		for (int i = 0; i <= 100; i = i + 2) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		int n = 5;
//		for (int i = 1; i <= n; i++ ) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		int tableOf = 2;
		for (int i = 1; i <= 10; i++) {
			System.out.println(tableOf * i);
		}
//		for (int i = 1; i<10; ) {
//			System.out.println(i);         // This loop will repeat infinitely till the storage of the data type is full.
//		}
		// if you put statement 2 or 3 false or even didn't write anything then the loop will continue infinitely.
		// but if you remove the statement one it will show a error that 'i' cannot be resolved
		// also if you don't put any statement it will be a infinite loop. Example: for ( ; ; ) {
//		   																			System.out.println("hello world"); }

	}

}
