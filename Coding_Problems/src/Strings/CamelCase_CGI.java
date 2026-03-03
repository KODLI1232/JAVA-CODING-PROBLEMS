package Strings;

public class CamelCase_CGI {
	
	public static void main(String[] args) {
		
		String input="heLLO worLD jAvA";
		
		String[] words=input.split("\\s+");
		
		StringBuilder camelCase = new StringBuilder();
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i].toLowerCase();
			
			if(i==0) {
				camelCase.append(word);
			}else {
				camelCase.append(Character
						.toUpperCase(word.charAt(0)))
						.append(word.substring(1));					
			}
		}
		System.out.println(camelCase);
	}

}
