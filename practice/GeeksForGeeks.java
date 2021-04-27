package practice;
import java.util.Scanner;

public class GeeksForGeeks {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        scan.close();
	        
	        while (true) {
	            // Used for loop termination
	            int len = s.length();
	            
	            // "(.)" is a capturing group that captures any character
	            // "\\1" is a backreference that will match the character captured by the first capturing group (i.e. the one captured by "(.)")
	            s = s.replaceAll("(.)\\1", "");
	            
	            // If no changes were made to string, break loop
	            if( s.length() == len ){
	                break;
	            }
	        }

	        System.out.println( (s.isEmpty()) ? "Empty String" : s);
	}
}
