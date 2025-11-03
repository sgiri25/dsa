package tries;

class NodeArr {
	NodeArr[] next = new NodeArr[2];
	private NodeArr[] children;
	private int freq;
	private char ch;
	
	NodeArr(){
		next[0] = null;
		next[1] = null;
		
	}
}
public class MaxORArray {
	NodeArr root;
	public void insert(int item) {
		NodeArr curr = new NodeArr();
		for(int i=31;i>=0;i--)
        {
			int bit = (item >> i)&1;
			//System.out.println(item +"<--->"+bit);
			if(curr.next[bit] == null) {
				curr.next[bit] = new NodeArr();
				
			}
			curr = curr.next[bit];
        }
	}
	
	public int max_xor(int num) {
		
		NodeArr curr = new NodeArr();
		int ans=0;
		int current_xor = 0;
//		for(int i = 31; i >= 0; i--) {
//			int bit = (num>>i)&1; //0
//			int desired_bit = 1 - bit;
//			System.out.println(desired_bit);
//			
//			if(curr.next[desired_bit] != null) {
//				ans +=(1<<i);
//				curr = curr.next[desired_bit];
//			}else {
//				curr = curr.next[bit];
//			}
//			
//		}
		
		for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int desired_bit = 1 - bit; // Try to get a '1' in XOR result
            
//            current_xor = (1 << i); 
//            System.out.println(num +"<---->"+current_xor);
            if(bit == 0) {
            	System.out.println(curr.next[0]);
            	if (curr.next[1] != null) {
                    curr = curr.next[1];
                    ans += (1 << i);
                }
                else {
                    curr = curr.next[0];
                }
            }else {
            	// if unset bit is present
                if (curr.next[0] != null) {
                    curr = curr.next[0];
                    ans += (1 << i);
                }
                else {
                    curr = curr.next[1];
                }
            }
//            if (curr.next[desired_bit] != null) {
//                current_xor = current_xor | (1 << i); // Add 1 at this position
//                curr = curr.next[desired_bit];
//            } else {
//                curr = curr.next[bit]; // Must take the same bit
//            }
        }
		//ans = Math.max(ans, current_xor);
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,10,5,25,2,8};
		int max_ans = 0;
		int n = nums.length;
		
		MaxORArray moa = new MaxORArray();
		for(int i = 0; i < n; i++) {
			moa.insert(nums[i]);
			max_ans=Math.max(max_ans,moa.max_xor(nums[i]));
		}
		
	}
}
