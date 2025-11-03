package pp;

public class FrequencySubArray {
	public static void main(String args[]) {
		int[] arr = {1,2,-1,1,0,1,4};
		int n = 7, k = 3, x = 1;
		int i = 0, j = 0, sum = 0;
		while(j < k) {
			if(arr[j++] == x) {
				sum += 1;
			}
		}
		System.out.println(sum);
		//System.out.println(j);
		
		while(j < n) {
			System.out.println("Before -->"+j);
			if(arr[j++] == x) sum += 1;
			System.out.println("After -->"+j);
			System.out.println("Before -->"+i);
			if(arr[i++] == x) sum -= 1;
			System.out.println("After -->"+i);
			//System.out.println(i);
			//System.out.println(j);
			System.out.println(sum);
		}
		
		
//		int n = 7, k =3, x = 1;
//		   int[] arr =  { 1,2 ,-1, 1, 0, 1,4};
//
//
//		   int i = 0, j = 0, ctr = 0;
//		   while(j<k){
//		       if(arr[j++] == x)  ctr++;
//		   }
//		   System.out.println(ctr);
//		   while(j<n){
//		       if(arr[j++] == x)  ctr++;
//		       System.out.println(j);
//		       System.out.println(ctr);
//		       if(arr[i++] == x)  ctr--;
//		       
//		       System.out.println(i);
//		       System.out.println(ctr);
//			 
//
//		       System.out.println(ctr);
//		   }
		
		
	}
}
