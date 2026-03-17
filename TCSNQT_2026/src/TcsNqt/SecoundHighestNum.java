package TcsNqt;

import java.util.Scanner;

public class SecoundHighestNum {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter n value :");
		
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		if(n<2) {
			System.out.println(-1);
			scanner.close();
			return;
		}
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if (arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
			}
			
		}
		if (max1==Integer.MIN_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println("Second Highest number :"+max2);
			
		}
		scanner.close();
	}

}
