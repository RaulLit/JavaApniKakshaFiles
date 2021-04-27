package oops.inheritance;

public class Person {
	
	protected String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Inside person constuctor");
	}
	
	public void walk() {
		System.out.println("person " + name + " is walking");
	}
	
	public void eat() {
		System.out.println("person " + name + " is eating");
	}

}
