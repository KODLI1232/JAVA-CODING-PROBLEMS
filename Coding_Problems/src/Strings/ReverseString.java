package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="KL";
		String t="Rahul";
		
		s=s.concat(t);
		System.out.println(s);
		
		
		String a="Welcome to Coding Practice";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--) {   // to iterate over string
			
			char ch=a.charAt(i);       		 // converting string into each character
			
			String ch1=Character.toString(ch);     // converting characters to String
			b=b.concat(ch1);							// Concatenating the string 
		}
		System.out.println("Actual String :"+a);  // actual String
		System.out.println("Reversed String :"+b);  // Reverse String
	}
}
