package TcsNqt;

import java.util.Scanner;

public class SuminRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Range : ");
		
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		
		int sum=0;
		
		for(int i=m;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of Range From "+m+" "+n + "are :" +sum);
		scanner.close();
	}

}
