package binary_search;

public class FirstLastOccurence {
	public static void main(String args[]) {
		int[] arr = {1,1,2,2,2,2,2,4,5,6,};
		int n = arr.length;
		int key = 8;
		
		int l = 0;
		int h = n - 1;
		int si = -1;
		int ei = -1;
		
		
		while(l <= h) {
			int m = (l + h) / 2;
			//System.out.println(m);
			
			if(arr[m] > key){
				h = m - 1;
			}else if(arr[m] == key) {
				ei = m;
				si = m;
				//System.out.println(arr[ei + 1] == key);
				if(ei < n-1) {
					while(arr[ei + 1] == key) {
						ei = ei + 1;
						if(ei == n - 1) {
							break;
						}
					}
				}
				
				//System.out.println("Before-->"+si);
				if(si > 0) {
					while(arr[si - 1] == key) {
						si = si - 1;
						if(si == 0) {
							break;
						}
						//System.out.println(si);
					}
				}
				
				System.out.println("End index-->"+ei);
				System.out.println("Start index-->"+si);
				return;
				//System.out.println("After-->"+si);
				
			}else {
				l = m + 1;
				
			}
		}
		if(si == -1 && ei == -1) {
			System.out.println("Key not found");
		}
	}
}
