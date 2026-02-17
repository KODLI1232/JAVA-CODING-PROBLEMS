package Palindrome;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String string="madam";
	
		String reversed= new StringBuilder(string).reverse().toString();
	
		System.out.println(string.equals(reversed));
	
	}

}
