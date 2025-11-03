package binary_search;

public class SingleElement {
	public static void main(String args[]) {
		int[] arr = {3,4,4,1,1,7,7,6,6};
		int n = arr.length;
		
		int l = 0;
		int h = n - 1;
		
		while(l <= h) {
			int m = (l+h)/2;
			System.out.println("m-->"+m);
			if(m == 0 && arr[m] != arr[m+1]) {
				System.out.println(arr[m]);
				return;
			}else if(m == n-1 && arr[m] != arr[m-1]) {
				System.out.println(arr[m]);
				return;
			}else if((m % 2 != 0 && arr[m] == arr[m+1]) || (m % 2 == 0 && arr[m] == arr[m-1])) {
				h = m - 1;
				System.out.println("l-->"+l);
			}else if((m % 2 == 0 && arr[m] == arr[m+1]) || (m % 2 != 0 && arr[m] == arr[m-1]))  {
				l = m + 1;
				System.out.println("h-->"+h);
			}
			else {
				if(arr[m+1] != arr[m] && arr[m-1] != arr[m]) {
					System.out.println(arr[m]);
					return;
				}
			}
		}
		
		
	}
}
