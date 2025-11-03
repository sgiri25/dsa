package hashing;

import java.util.HashMap;

public class Substring {
	public static void main(String args[]) {
		String s1 = "aababbaabbaaa";
		String[] words = {"ab","ba","ab"};
		int k = 2;
		int n = words.length * k;
		
		HashMap<String, Integer> hmap = new HashMap<>();
		for(int i = 0; i < words.length; i++) {
			if(hmap.containsKey(words[i])){
				hmap.put(words[i], hmap.get(words[i])+1);
			}else {
				hmap.put(words[i], 1);
			}
		}
		
		HashMap<String, Integer> hmap1 = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String extract_str = null;
			if(n+i < s1.length()) {
				extract_str = s1.substring(i, n+i);
			}else if(n+i > s1.length()) {
				extract_str = s1.substring(i, s1.length());
			}
			System.out.println(i+"------------"+extract_str);
			
			for(int j = 0; j < extract_str.length(); j += k) {
				String split_2 = extract_str.substring(j, k+j);
				if(hmap1.containsKey(split_2)){
					hmap1.put(split_2, hmap1.get(split_2)+1);
				}else {
					hmap1.put(split_2, 1);
				}
				System.out.println(hmap1);
				
			}
			int flag = 1;
			for(int j = 0; j < words.length; j++) {
				if(hmap1.get(words[j]) != null) {
					if(hmap1.get(words[j]) == hmap.get(words[j])) {
						System.out.println(i);
					}
				}else {
					flag = 0
				}
			}
			hmap1.clear();
			
		}
		
		
		
	}
}
