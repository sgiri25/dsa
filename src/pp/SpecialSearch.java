package pp;

public class SpecialSearch {
	public static void main(String args[]) {
		int[][] arr = {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		
		int k = 29;
		
		int i = 0, j = 3;		
		while(i < 4) {
			if(k < arr[i][j]) {
				j--;
			}else if(k > arr[i][j]) {
				i++;
			} else if(arr[i][j] == k) {
				System.out.println(i+"---"+j);
				break;
			}
		}
	}
}
