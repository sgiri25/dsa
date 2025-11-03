package hashing;

public class PermutationString {
	public static void main(String args[]) {
		String s1 = "abkc";
		String s2 = "pqbabkcd";
		
		int window_length = s1.length();
		int n = s2.length();
		int i = 0;
		while(window_length+i < n) {
			if(s2.substring(i, window_length+i).equals(s1)) {
				System.out.println("s1 is found in s2");
				break;
			}
			++i;
		}
		
		
	}
}
