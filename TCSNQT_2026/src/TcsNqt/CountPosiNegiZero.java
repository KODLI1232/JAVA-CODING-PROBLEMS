package TcsNqt;

import java.util.Scanner;

public class CountPosiNegiZero {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the n value ");
		
		int n=scanner.nextInt();
		
		System.out.println("Enter numbers");
		
		
		int positiveCount=0;
		int negativeCount=0;
		int zeroCount=0;
		
		for(int i=0;i<n;i++) {
			int num=scanner.nextInt();
			
			if(num>0) {
				positiveCount++;
			}else if (num<0) {
				negativeCount++;
			}else {
				zeroCount++;
			}
				
		}
		System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
		scanner.close();
	}

}
