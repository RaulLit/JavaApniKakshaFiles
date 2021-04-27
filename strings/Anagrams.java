package strings;

public class Anagrams {

	public static void main(String[] args) {
		
		String a = "cat";
		String b = "act";
		
		boolean isAnagram = false;
		
//		boolean visited [] = new boolean [b.length()];
//		for (int i=0; i < a.length(); i++) {
//			char c = a.charAt(i);
//			isAnagram = false;
//			for (int j = 0; j < b.length(); j++) {
//				if (b.charAt(j) == c && !visited[j]) {
//					visited[j] = true;
//					isAnagram = true;
//					break;
//				}
//			}
//			if (!isAnagram) {
//				break;
//			}
//		}
		
		isAnagram = true;
		
		int al[] = new int [256];
		
		for (char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for (char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		
		for (int i = 0; i < 256; i++) {
			if (al[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		
		if (isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
		

	}

}
