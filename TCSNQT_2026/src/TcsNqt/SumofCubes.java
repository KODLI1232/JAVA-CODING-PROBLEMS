package TcsNqt;

import java.util.Scanner;

public class SumofCubes {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter range : ");

		int a =scanner.nextInt();
		int b=scanner.nextInt();
		
		long sum=0;
		
		for(int i=a;i<=b;i++) {
			sum+=i*i*i;
		}
		System.out.println(sum);
		scanner.close();
	}

}
