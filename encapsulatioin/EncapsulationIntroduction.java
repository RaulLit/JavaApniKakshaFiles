package encapsulatioin;

public class EncapsulationIntroduction {
	
	/* 1) To achieve encapsulation declare the variables of a class as private 
	 * 2) Provide public setter and getter methods 
	 * 3) That's it    */
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.setAge(18);
		
		System.out.println(obj.getAge());

	}

}
