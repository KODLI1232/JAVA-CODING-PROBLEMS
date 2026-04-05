package Arrays;

import java.util.HashSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		
//		int[] arr= {1,5,4,3};
//		
//		int n=5;
		
//		int expectedSum=n*(n+1) / 2;
//		int actualSum=0;
//		
//		for(int num:arr) {
//			actualSum+=num;
//		}
//		
//		int missingNum=expectedSum - actualSum;
//		System.out.println("Missing Number :" +missingNum);
        
		
		// USING XOR 
		
//		int[] arr= {1,5,4,3};
//		int n=5;
//		int xor1=0, xor2=0;
//		
//		for(int i=1;i<=n;i++) {
//			xor1 ^= i;
//		}
//		
//		for(int num:arr) {
//			xor2 ^=num;
//		}
//		
//		int missingNum= xor1 ^ xor2;
//		
//		System.out.println("Missing number :"+missingNum);
		
        int[] arr= {1,5,4,3};
		int n=5;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num:arr) {
			set.add(num);
		}
		
		for(int i=1;i<=n;i++) {
			if(!set.contains(i)) {
				System.out.println("Missing num :"+i);
				break;
			}
		}
		
	}

}
