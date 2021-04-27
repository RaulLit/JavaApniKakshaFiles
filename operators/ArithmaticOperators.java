package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 45;
		
//		int c = a * a + b * b + 2*a*b;
//		int d = (a + b) * (a + b);
		
//		double c =(double) b/ (double) a;
		
//		int c = b % a;  // '%' this is called modulo operator and it gives remainder
		
//		int c = ++b;  // the ans came as 46  46 
		
//		int c = b++;  // the ans came as 45  46
		
//		int c = --b;  // the ans came as 44  44
		
		int c = b--;  // the ans came as 45  44
		
		System.out.println(c + "  " + b);
		
	}

}
