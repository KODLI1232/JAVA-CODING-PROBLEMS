package Palindrome;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
//		String string="madam";
//	
//		String reversed= new StringBuilder(string).reverse().toString();
//	
//		System.out.println(string.equals(reversed));
	
		
		// another Type
		
		String string="madam";
		String reversedString="";
		
		for(int i=string.length()-1;i>=0;i--) {
			reversedString+=string.charAt(i);
		}
		
		if(string.equals(reversedString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
