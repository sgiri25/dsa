package striver_graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder {
	static void wordWatch(String x, HashMap<String, Boolean> Vmap, Queue<String> q) {
		
		for(int s = 0; s < x.length(); s++) {
			StringBuilder s1 = new StringBuilder(x);
			for (int i = 0; i < 26; i++) {
	            char c = (char) ('a' + i); // starting from 'A'
	            s1.setCharAt(s, c);
				String modifiedString = s1.toString(); 
				System.out.println(modifiedString);
				if(Vmap.get(modifiedString) != null && Vmap.get(modifiedString) == false ) {
					
					q.add(modifiedString);
					Vmap.put(modifiedString, true);
					break;
				}
	            //System.out.print(ch + " ");
	        }

		}
		
//		for(int s = 0; s < x.length(); s++) {
//			char[] word = x.toCharArray();
//			for(int j = 0; j < 26; j++) {
//				char c = (char)('a' + j);
//				word[s] = c;
//				String s1 = String.valueOf(word);
//				if(Vmap.containsKey(s1) && Vmap.get(s1) == false) {
//					q.add(s1);
//					Vmap.put(s1, true);
//				}
//			}
//		}
		
		
		
	}
	static int wordLadder(String s1, String s2, String[] word_list) {
		HashMap<String, Boolean> Vmap = new HashMap<>();
		for(int i = 0; i < word_list.length; i++) {
			Vmap.put(word_list[i], false);
		}
		Queue<String> q = new LinkedList<>();
		int length = 1;
		q.add(s1);
		Vmap.put(s1, true);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				String w = q.poll();
				if(w.equals(s2)) {
					return length;
				}
				wordWatch(w, Vmap, q);
			}
			length++;
		}
		return 0;
	}
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		
		String[] word_list = {"hot", "dot", "dog", "lot", "log", "cog"};
		System.out.println(wordLadder(start, end, word_list));
		
	}
}
