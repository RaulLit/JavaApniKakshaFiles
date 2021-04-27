package oops.abstraction;

public class WagonR extends Car {
	//A abstract method should be overridden in the child class.
	public void accelerate() {
		System.out.println("WagonR is accelerating");
	}
	
	public void breaking() {
		System.out.println("WagonR is breaking");
	}
}
