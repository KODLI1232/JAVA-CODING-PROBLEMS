package Strings;

public class String_Methods {
	public static void main(String[] args) {
		String string="Hello,Welcome  ";
		
		System.out.println("Length of String: "+string.length());
		System.out.println("To Upper Case :"+string.toUpperCase());
		System.out.println("To Lower case :"+string.toLowerCase());
		System.out.println("SubString "+string.substring(6, 12));
		System.out.println("Removing white/extra spaces :"+string.trim());
		System.out.println("finding the character at index :"+string.charAt(5));
		System.out.println("Substring :"+ string.substring(6));
		System.out.println("Conacatenating :"+string.concat("!!!"));
		System.out.println("Index of W: "+string.indexOf("W"));
		System.out.println("Comapring of String :"+string.equals("Hello,Welcome"));
		System.out.println("Ignore case sensitive :"+ string.equalsIgnoreCase("Hello,Welcome"));
		System.out.println("Comparing Strings :"+string.compareTo("Hello,KSK"));
		System.out.println("Comparing Strings ignore case :"+string.compareToIgnoreCase("Hello KSK"));
		System.out.println("Replace Characters in String :"+string.replace("W","R"));
		
		System.out.println("Whether the string conatins World :"+string.contains("World"));
	
		char[] chars=string.toCharArray();
		
		for(char c:chars) {
			
		System.out.println("Converting string to characters :"+c +"");
	}
		
		System.out.println("Checks starts with H :" +string.startsWith("Hello"));
   }
}
