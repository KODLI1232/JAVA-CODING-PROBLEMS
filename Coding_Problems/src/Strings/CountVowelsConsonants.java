package Strings;


public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		String input= "Hello,I am Shiva";
		
		 input=input.toLowerCase();
		 int vowels=0, consonants=0;
		 
		 for(char c:input.toCharArray()) {
			 if(c>='a' && c<='z') {
				 if("aeiou".indexOf(c)!=-1) {
					 vowels++;
				 }else {
					 consonants++;
				 }
			 }
		 }
		 
		 System.out.println("Vowels:"+vowels + 
				 			      ", Consonants :"+consonants);

	}

}
