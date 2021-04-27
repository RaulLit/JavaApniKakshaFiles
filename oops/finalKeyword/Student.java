package oops.finalKeyword;

public final class Student {
	
	int rollNo;
	String name;
	
//	final int ROLL_NO;
//	final String name;
//	
//	//You can initialize the final variables like the following:
//	
//	//Initializer block
//	{
//		ROLL_NO = 4;
//	}
//	
//	// For static final variables we use static blocks
//	static {
//		
//	}
//	
//	// Constructor
//	public Student() {
//		name = "Aditya";
//	}
	
	public final void getDescription() {
		System.out.println("Student's name is " + name);
	}

}
