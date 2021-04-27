package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {  // There is a "Object" class in java which is the parent of all the classes by default.
		
//		Teacher t = new Teacher();
		
//		t.name = "Mr. Harry";
//		
//		t.eat();
//		t.walk();
//		t.teach();
//		
//		Singer s = new Singer();
//		
//		s.name = "Oprah";
//		
//		s.sing();
//		s.eat();
		
			//	UPCASTING(implicit casting)
//		Teacher t = new Teacher();
//		Person p = t;	// it's fine since t is teacher and teacher is a person.
		
			//	DOWNCASTING(explicit casting)
//		Person p = new Person();
		//  A person is not a teacher. A person may be a teacher. 
//		Teacher t = (Teacher) p;	// We have to explicitly tell that the person is a teacher to remove compile time error.
		// if we run this it will show a run time error. Since p is a person and not a teacher.
		// The correct way is.
		Teacher t1 = new Teacher("Mr. Harry");
		
		Singer s1 = new Singer("");
		
		Person p = t1;	// this give a running time error since the person is singer and teacher t is assigned as person 
		//but the person is not a teacher, it is a singer.
		
//		Person p = t1;		//The person p is assigned as an teacher. t is a person p which is actually a teacher at the end.
		
		Teacher t = (Teacher)p; // p may be a teacher. the objects are checked while running the code.
		
		// To check weather the object is of which instance i.e. of a Teacher or a singer, we use a keyword instanceof.
		
//		System.out.println(t1 instanceof Teacher);
//		System.out.println(s1 instanceof Person);
//		System.out.println(s1 instanceof Singer);
//		System.out.println(p instanceof Person);
//		System.out.println(p instanceof Teacher);
//		System.out.println(p instanceof Singer);
//		System.out.println(t instanceof Teacher);
//		System.out.println(t instanceof Person);
		
		t.name = "Mr. Harry";
		t.eat();
	}

}
