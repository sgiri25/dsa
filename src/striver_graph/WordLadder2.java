package striver_graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder2 {
	static void wordWatch(String x, HashMap<String, Boolean> Vmap, Queue<String> q) {
		
		for(int s = 0; s < x.length(); s++) {
			StringBuilder s1 = new StringBuilder(x);
			for (int i = 0; i < 26; i++) {
	            char c = (char) ('a' + i); // starting from 'A'
	            s1.setCharAt(s, c);
				String modifiedString = s1.toString(); 

				if(Vmap.get(modifiedString) != null && Vmap.get(modifiedString) == false ) {
					System.out.println(x+">>"+modifiedString);
					q.add(modifiedString);
					Vmap.put(modifiedString, true);
					
				}
	        }

		}
	}
	static void wordLadder2(String s, String e, String[] word_list) {
		HashMap<String, Boolean> Vmap = new HashMap<>();
		for(int i = 0; i < word_list.length; i++) {
			Vmap.put(word_list[i], false);
		}
		
		Queue<String> q = new LinkedList<>();
		q.add(s);
		Vmap.put(s, true);
		
		
		while(!q.isEmpty()) {
			int size = q.size();
			String w = q.poll();
			wordWatch(w, Vmap, q);
		}
		
	}
	public static void main(String[] args) {
		String[] word_list = { "pat", "bot", "pot","poz", "coz" };
		String start = "bat";
		String end = "coz";
		wordLadder2(start, end, word_list);
	}
}
