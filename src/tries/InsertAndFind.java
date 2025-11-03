package tries;

public class InsertAndFind {
	// Array for child nodes of each node
	InsertAndFind[] children;
	
	
	// Used for indicating the end of string
	boolean isEndOfWord;
	
	// Constructor
	public InsertAndFind() {
		// Initialize the wordend variable with false 
		isEndOfWord = false;
		
		
		// Initialize the every index of the child array with null
		// In java we do not have to explicitely assign null as the values are by default assign null
		
		children = new InsertAndFind[26];
	}
	
	static void insert(InsertAndFind root, String key) {
		// Initialize the curr pointer with the root node
		InsertAndFind curr = root;
		
		// Iterate accross the length of the string
		for(char c : key.toCharArray()) {
			// check if the node exists for the current character in the trie
			if(curr.children[c - 'a'] == null) {
				// If noe for current character does not exists, then make a new node
				InsertAndFind newNode = new InsertAndFind();
				
				curr.children[c - 'a'] = newNode;
			}
			
			curr = curr.children[c - 'a'];
		}
		
		curr.isEndOfWord = true;
	}
	
	public boolean search(InsertAndFind root, String key) {
		InsertAndFind curr = root;
		
		for(char c : key.toCharArray()) {
			if(curr.children[c - 'a'] == null) {
				return false;
			}
			curr = curr.children[c - 'a'];
		}
		
		return curr.isEndOfWord;
	}
	
	public boolean isPrefix(InsertAndFind root, String key) {
		InsertAndFind curr = root;
		for(char c : key.toCharArray()) {
			if(curr.children[c - 'a'] == null) {
				return false;
			}
			curr = curr.children[c - 'a'];
		}
		return true;
	}
	
	// Returns true if root has no children, else false
    static boolean isEmpty(InsertAndFind root)
    {
        for (int i = 0; i < 26; i++)
            if (root.children[i] != null)
                return false;
        return true;
    }
	
	static InsertAndFind deletion(InsertAndFind root, String key, int depth) {
		InsertAndFind curr = root;
		
		if (root == null) return null;
		
		if(depth == key.length()) {
			if(curr.isEndOfWord) {
				curr.isEndOfWord = false;
			}
			
			// If given is not prefix of any other word
			if(isEmpty(curr)) {
				curr = null;
				
			}
			return curr;
		}
		
		// if not last character, recur for the child
		// obtained using ASCII value
		
		int index = key.charAt(depth) - 'a';
		curr.children[index] = deletion(curr.children[index], key, depth + 1);
		
		// If root does not have any child (its only child got
        // deleted), and it is not end of another word.
		if (isEmpty(curr) && curr.isEndOfWord == false){ 
            curr = null;
        }
		
		return curr;
	}
	
	
	
	
	public static void main(String args[]) {
		InsertAndFind trie = new InsertAndFind();
		String[] arr = {"and", "ant", "do", "dad"};
		for (String s : arr) {
			insert(trie, s);
		}
		
		String[] searchKeys = { "do", "gee", "bat"};
		for(String s : searchKeys) {
			if(trie.search(trie,s)) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		
		System.out.println();
        String[] prefixKeys = { "ge", "an", "do", "de" };
        for (String s : prefixKeys) {
            if (trie.isPrefix(trie, s))
                System.out.print("true ");
            else
                System.out.print("false ");
        }
        
        deletion(trie, "anddd", 0);
        if(trie.search(trie, "and"))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	
	

}
