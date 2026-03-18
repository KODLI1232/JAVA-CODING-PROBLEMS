package TcsNqt;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the n value ");
		
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
