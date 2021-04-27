package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
//		int a = 5;
//		int b = 6;
//		
//		int c = 5 & 6;
//		
//		System.out.println(c);  // the ans came as 4
		
		int a = 10;
		int b = 13;
		
//		int c = a | b;
//		
//		System.out.println(c); // the ans came as 15
		
		// 1101  ->  0110  ->  0011  ->  0001  ->  0000  ->  0000
		//  13        6         3         1         0         0
		
//		int c = b >> 2;  // when b >> 1; the ans came 6. when b>>2 the ans came 3.
		
		// the right shift operator '>>' divides the number by 2 and take the ground value
		// the left shift operator '<<' doubles the number.
		
//		int c = b << 1; // the ans came as 26
		
		int c = b << 2; // the ans came as 52
		
		System.out.println(c);

	}

}
