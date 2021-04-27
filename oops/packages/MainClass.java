package oops.packages;

import java.util.*;

import oops.packages.models.*;		// '*' star symbol is used when you want to import all the files from a package.

//import oops.packages.models.Student;
//import oops.packages.models.Teachers;

public class MainClass {

	public static void main(String[] args) {
		
		Student obj = new Student("Tom");
		
		obj.name = "Jerry";   // Will show error because the "name" in Student class is 'private' hence it can be used only in its class.
		// for us to be able to access it we need to change the access modifier to 'public'.
		
		obj.getPassword();		// The getPassword function is in Student class of models package and was having default access modifier.
		// In default access modifier you can access the function/method in that package itself but not outside the package.
		// To set default access modifier you don't need to put anything in front of the function/method
		
		// The 'public' access modifier allows everyone to access the function/method.
		
		Teachers teacher = new Teachers();
		
		Scanner sc = new Scanner(System.in);

	}

}
