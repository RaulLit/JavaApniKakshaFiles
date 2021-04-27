package lists;

public class Pairs <X, Y> {
	
	X x;
	Y y;
	
	public Pairs(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y);
	}
}
