package pp;

public class ArrayReArrangement1 {
	public static void main(String args[]) {
		int[] arr = {2,0,1,4,5,3};
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int ind = arr[i];
			int val = i;
			//System.out.println("1");
			//System.out.println("BRFORE WHILE-->"+ind);
			//System.out.println("BRFORE WHILE-->"+val);
			
			
			while(ind != i) {
				//System.out.println("2");
				int temp_val = arr[ind];
				arr[ind] = val;
				val = ind;
				ind = temp_val;				
				
			}
			arr[i] = val;
			//System.out.println("AFTER WHILE-->"+ind);
			//System.out.println("AFTER WHILE-->"+val);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
