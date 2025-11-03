package pp;
// TC - O(N) SC - O(N)
public class ArrayReArrangement {
	public static void main(String args[]) {
		int[] arr = {1,3,0,2};
		int n = arr.length;
		int[] temp = new int[n];
		
		for(int i = 0; i < n; i++) {
			temp[arr[i]] = i;			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(temp[i]);
		}
	}
}
