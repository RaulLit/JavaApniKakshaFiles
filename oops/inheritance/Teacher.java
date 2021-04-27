package oops.inheritance;

public class Teacher extends Person {	// left side of "extends" is the children class and right side is parent class.
	
	public Teacher(String name) {
		super(name);
		System.out.println("in the teacher constuctor");
	}
	
	public void teach() {
		System.out.println(name + " is teaching");
	}
	// this is how one can override a method of parent class in children class.
	public void eat() {		// "super" keyword is used to access the just above/immediate parent class.
		super.eat();	// now first the parent class function eat() will run then the Teacher class eat() will run.
		System.out.println("teacher " + name + " is eating");
	}
}
