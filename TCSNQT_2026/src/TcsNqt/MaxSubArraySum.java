package TcsNqt;

import java.util.Scanner;

public class MaxSubArraySum {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter n value");
		
		int n =sc.nextInt();
		
		System.out.println("Enter array of elements");
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int maxSum=Integer.MIN_VALUE;
		
		int currentSum=0;
		
		for(int i=0;i<n;i++) {
			currentSum=arr[i];
			
			if(currentSum>maxSum) {
				maxSum=currentSum;
			}
			
			if(currentSum<0) {
				currentSum=0;
			}
		}
		System.out.println("Maximum sum of subarray :"+maxSum);
		
	}

}
