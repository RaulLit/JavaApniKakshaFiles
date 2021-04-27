package strings;

public class Assignment {

	public static void main(String[] args) {
		
		String words = "I love Java, the coffee";
		
		String word [] = words.split(" ");
		
		int reverse = word.length -1;;
		
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[reverse] + " ");
			reverse--;
		}

	}

}
