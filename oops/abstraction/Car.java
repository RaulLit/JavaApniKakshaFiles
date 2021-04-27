package oops.abstraction;

public abstract class Car {		// For a method to be abstract, the class in which that method is present should also be abstract.
		// An abstract class can have both abstract methods and normal methods (i.e non abstract methods, also called concrete methods).
	// You cannot make an object of abstract class.
	public abstract void accelerate();
	
	public abstract void breaking();
	
	public void honking() {
		System.out.println("Car is honking");
	}
	
}
