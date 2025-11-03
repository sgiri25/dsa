package pp;

public class MaxChunk {
	public static void main(String args[]) {
		//int[] arr = {1,0,2,3,4};
		int[] arr = {1,2,3,0,4};
		//int[] arr = {1,2,0,5,3,4};
		//int[] arr = {5,4,3,2,1,0};
		int n = arr.length;
		int temp;
		int ans = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(arr[j] == i) {
					ans += 1;
					i = j + 1;
					System.out.println(i+"---"+j);
					
					
				}
				
			}
			
		}
		
		System.out.println(ans);
	}
}
