package oops;

class Cat {   
	boolean hasFur;
	String breed, color;
	int legs, eyes;
	
	public void walk() {   // this is a method or function named walk
		System.out.println("Cat is walking");
	}
	
	public void eating() {
		System.out.println("Cat is eating");
	}
	
	public void description() {
		System.out.println("My cat has " + legs + " legs and " +eyes + " eyes.");
	}
}

class Dog {
	String breed, name;
	
	public void jump() {
		System.out.println("My dog " + name + " is jumping");
	}
	public void description() {
		System.out.println("My dog's name is " + name + " and his breed is " + breed);
	}
}

// There is always only one public class in a .java file whose name should be equal to the name of the file
public class MainClass {

	public static void main(String[] args) {
		// new is the keyword that creates actual space in the memory for that variable name. 
		//In this example cat1 and cat2 are the variable names of the space created using the keyword 'new'

//		Cat cat1 = new Cat();          this is how one can make a object of a particular class
//		Cat cat2 = new Cat();   	   ClassName objectName = new ClassName();
//		
//		cat1.legs = 3;
//		cat1.eyes = 4;
//		
//		cat2.legs = 4;
//		cat2.eyes = 1;
//		
//		cat1.description();
//		cat2.description();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.breed = "Husky";
		dog1.name = "Browny";
		
		dog2.breed = "Poodle";
		dog2.name = "Mr. Sanju";
		
		dog1.jump();
		dog1.description();
		
		dog2.jump();
		dog2.description();
		
	}

}
