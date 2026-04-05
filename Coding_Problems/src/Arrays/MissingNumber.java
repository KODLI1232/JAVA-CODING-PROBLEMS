package Arrays;

import java.util.HashSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,5};
		
		int n=5;
		
		int expectedSum=n*(n+1) / 2;
		int actualSum=0;
		
		for(int num:arr) {
			actualSum+=num;
		}
		
		int missingNum=expectedSum - actualSum;
		System.out.println("Missing Number :" +missingNum);
        
		
		// USING XOR 
		
		int[] arr1= {1,2,3,5};
		int n1=5;
		int xor1=0, xor2=0;
		
		for(int i=1;i<=n1;i++) {
			xor1 ^= i;
		}
		
		for(int num:arr1) {
			xor2 ^=num;
		}
		
		int missingNum1= xor1 ^ xor2;
		
		System.out.println("Missing number using XOR :"+missingNum1);
		
        int[] arr2= {1,2,3,5};
		  int n3=5;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num1:arr2) {
			set.add(num1);
		}
		
		for(int i=1;i<=n3;i++) {
			if(!set.contains(i)) {
				System.out.println("Missing number using set :"+i);
				break;
			}
		}
		
	}

}
