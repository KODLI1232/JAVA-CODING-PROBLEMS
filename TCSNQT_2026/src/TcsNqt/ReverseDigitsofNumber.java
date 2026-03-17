package TcsNqt;

import java.util.Scanner;

public class ReverseDigitsofNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		
		int sign=(number<0) ? -1 : 1;
		
		number=Math.abs(number);
		
		int reversed=0;
		
		while(number>0) {
			
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;
		}
		
		reversed=reversed*sign;
		
		System.out.println(reversed);
		
		scanner.close();
	}

}
