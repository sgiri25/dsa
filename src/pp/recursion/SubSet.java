package pp.recursion;

public class SubSet {
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int n = arr.length;
		int[] temp = new int[n];
		int sz = 0;
		getSubSet(0, n, sz, temp, arr);
	}
	
	public static void getSubSet(int i, int n, int sz, int[] temp, int[] arr ) {
		if(i == n) {
			// print the temporary array
			for(int j = 0; j< temp.length; j++) {
				System.out.print(temp[j]);
			}
			System.out.print("\n");
			return;
		}
		//System.out.println(i+"---"+arr[i]);
		
		
		
		temp[sz] = arr[i];
		getSubSet(i+1, n, sz+1, temp, arr);
		
		getSubSet(i+1,n,sz, temp, arr);
		
		
	}
}
