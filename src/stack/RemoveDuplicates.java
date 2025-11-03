package stack;

import java.util.Stack;

public class RemoveDuplicates {
	public static void main(String args[]) {
		String s1 = "cbacdcbc";
		String result = "";
		int[] freq = new int[s1.length()];
		for(int i = 0; i< s1.length(); i++) {
			freq[s1.charAt(i) - 'a']++; 
		}		
		
//		for(int i = 0; i < freq.length; i++) {
//			System.out.println(freq[i]);
//		}
		
		Stack<Byte> s2 = new Stack<Byte>();
		for(int i = 0; i< s1.length(); i++) {
			if(s2.empty()) {
				s2.push((byte)s1.charAt(i));
				freq[s1.charAt(i) - 'a']--;
			}else if(s1.charAt(i) < s2.peek() && freq[s2.peek() - 'a'] > 1) {
				
				s2.pop();
				s2.push((byte)s1.charAt(i));
				freq[s1.charAt(i) - 'a']--;
				//s1.charAt(i);
			}else if(!s2.empty() && freq[s1.charAt(i) - 'a'] == 1) {
				s2.push((byte)s1.charAt(i));
				freq[s1.charAt(i) - 'a']--;
			}
			
		}
		
		
	}
}
