package TcsNqt;

import java.util.Scanner;

public class MoveallZeroToEnd {
	
	public static void main(String[] args) {
		
		System.out.println("Enter The n value ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter array values ");
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
		}
		}
		
		for(int i=count;i<n;i++) {
		    arr[i]=0;
		    
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	   }
	
}

