package maps;
import java.util.*;

public class HashCodeAndEquals {
	
/*	hashCode() and equals() methods have been defined in Object class which is parent class for java objects. For this reason, all 
 * 	java objects inherit a default implementation of these methods.
 * 
 * 	If two objects are equal, then they must have the same hash code.
 * 	If two objects have the same hash code, they may or may not be equal.
 * 
 * 	BEST PRACTICE
 * 
 * 	1. Always use same attributes of an object to generate hashCode() and equals() both.
 * 	2. equals() must be consistent (if the objects are not modified, then it must keep returning the same value).
 * 	3. Whenever a equals(b), then a hashCode() must be same as b.hashCode().
 * 	4. If you override one, then you should override the other.
 */

	public static void main(String[] args) {
		
		Pen pen1 = new Pen(10, "Blue");
		Pen pen2 = new Pen(10, "Blue");
		
		System.out.println(pen1);
		System.out.println(pen2);
		
//		System.out.println(pen1 == pen2);
		System.out.println(pen1.equals(pen2));
		
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		
		System.out.println(pens);

	}
}

class Pen {
	int price;
	String color;
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
	// Eclipse has a feature where they create override hashCode and equals for us considering all the test cases.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	// THIS IS A SIMPLE OVERRIDE WITH CONSIDERING ALL THE EDGE CASES
//	@Override
//	public int hashCode() {
//		return price + color.hashCode();
//	}
//	
//	@Override	// Override annotation helps to correct typo(i.e. spelling mistake in overriding)
//	public boolean equals(Object obj) {
//		Pen that = (Pen) obj;
//		return this.price == that.price && this.color.equals(that.color); // or this.color.hashCode() == that.color.hashCode();
//	}

}
