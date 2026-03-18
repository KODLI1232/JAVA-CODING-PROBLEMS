package TcsNqt;

import java.util.Scanner;

public class PalindormCheck {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		
		String string=scanner.nextLine();
		
		string=string.replaceAll("[^a-z A-Z 0-9]", " ").toLowerCase();
		
		int left=0;
		int right=string.length()-1;
		
		boolean isPalindrome=true;
		
		while(left<right) {
			if(string.charAt(left)!=string.charAt(right)) {
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		}
		if (isPalindrome) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}

}
