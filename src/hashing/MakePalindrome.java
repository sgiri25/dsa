package hashing;

import java.util.HashMap;

public class MakePalindrome {
	public static void main(String args[]) {
		String[] words = {"xyz", "p", "zyx", "rrp", "ppprr"};
		int n = words.length;
		
		HashMap<String, Integer> hmap = new HashMap<>();
		for(int i = 0; i < n; i++) {
			hmap.put(new StringBuffer(words[i]).reverse().toString(), i);
			
		}
		
		for(int i = 0; i < n; i++) {
			int temp_len = words[i].length();
			//while(temp_len > 0) {
				if(hmap.get(words[i]) != null) {
					System.out.println(i+"---"+hmap.get(words[i]));
					//temp_len--;
				}
			//}
		}
	}
}
