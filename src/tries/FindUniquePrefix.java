package tries;


class Node {
	private Node[] children;
	private int freq;
	private char ch;
	
	Node(char x){
		freq = 0;
		ch = x;
		children = new Node[26];
	}
	
	// insert a word into trie
	void insert(String word) {
		Node curr = this;
		for(char c : word.toCharArray()) {
			if(curr.children[c - 'a'] == null) {
				curr.children[c - 'a'] = new Node(c);
			}
			curr = curr.children[c - 'a'];
			curr.freq++;
		}
	}
	
	// Find the ending index of minimum 
    // unique prefix for given word
	int findPrefix(String word) {
		Node curr = this;
		for(int i = 0; i < word.length(); i++) {
			curr = curr.children[word.charAt(i) - 'a'];
			if(curr.freq == 1) {
				return i;
			}
		}
		return word.length() - 1;
	}
}

public class FindUniquePrefix {
	static String[] findPrefixes(String[] arr) {
		int n = arr.length;
		// create root node of trie
		Node root = new Node('*');
		// Insert all words into trie
		for(int i = 0; i < n; i++) {
			root.insert(arr[i]);
		}
		
		// Array to store result prefixes
		String[] result = new String[n];
		
		// find minimum unique prefix for each word
		for(int i = 0; i < n; i++) {
			String word = arr[i];
			// getting ending index of minimum prefix
			int endIndex = root.findPrefix(word);
			// Add Substring from start to endIndex to result
			result[i] = word.substring(0, endIndex + 1);
		}
		
		return result;
		
	}
	public static void main(String args[]) {
		String[] arr = {"zebra", "dog", "duck", "dove"};
		String[] ans = findPrefixes(arr);
		
		for(String val : ans) {
			System.out.println(val);
		}
	}
}
