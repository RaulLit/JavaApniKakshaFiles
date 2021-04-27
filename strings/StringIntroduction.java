package strings;

public class StringIntroduction {

	public static void main(String[] args) {
		
//		String name = "Aditya";
//		String name2 = new String("Aditya");
//		String name1 = "Aditya";
        /*The sting with variable name 'name' stores the value in sting pool area where 
          as the variable with name 'name2' stores value in heap area.*/
//		System.out.println(name == name2);   // The result comes out to be false
//		System.out.println(name == name1);   // The result comes out to be true
		
		             //FUNCTIONS IN STRINGS
		
		
//		String name = "Aditya";
//		System.out.println(name.charAt(0)); //  It will print 'A'

		
//		String name = "Aditya";	
//		System.out.println(name.length());  //  It will print 6
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.substring(2));  // It will print 'itya Raul'
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.substring(3, 9));  // It will print 'tya Ra'    it prints till b-1 where b is substing(a, b)
//		System.out.println(name.substring(7, 8));  // It will print 'R'  ---- exception for b-1------ Also if you put the whole index
												   // i.e. in this case (0, 11) it will print the whole string
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.contains("Raul")); // Prints 'true' --- It searches the given characters in the string, if it is there it prints 'true' if not it prints 'false'
		
		
//		String name = "Aditya Raul";
//		String name2 = new String("Aditya Raul");
//		System.out.println(name.equals(name2));  // Prints 'true' --- Checks only the value of the two different strings
		
		
//		String name = "";
//		String name2 = new String("Aditya Raul");
//		System.out.println(name.isEmpty());  // Will print 'true'
		
		
//		String name = "Aditya";
//		name = name + " Kashinath";   // <--This is also one of the way to concat(join) to Strings
//		System.out.println(name.concat(" Raul"));   // It will print 'Aditya Kashinath Raul'
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.replace("A", "a"));  // Prints 'aditya Raul'
//		System.out.println(name.replace("Aditya", "Omkar"));  // Prints 'Omkar Raul'
		
		
//		String cars = "Hyundai, Maruti, Swift, WagonR, Farrari, Lamborghini";
//		String [] allCars = cars.split(", ");
//		for (String car: allCars) {
//			System.out.println(car);  // It will print all the car names in the order and one line after the 
//		}						      //other without ", " because it gets split around ", "
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.indexOf('R'));  // Prints the index of the character which we give, in this case it is 7
//		System.out.println(name.indexOf('x'));  // Prints -1 if the given character is not found in the string.
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.toLowerCase());  // Prints 'aditya raul'  it converts all upper case letters to lower case letters
		
		
//		String name = "Aditya Raul";
//		System.out.println(name.toUpperCase());  // Prints 'ADITYA RAUL' it converts all lower case letters to upper case letters
		
		
		String name = "   Aditya Raul   ";
		System.out.println(name.trim());  // Prints 'Aditya Raul' --- it removes the extra spaces before and after the main String characters
		
	}

}
