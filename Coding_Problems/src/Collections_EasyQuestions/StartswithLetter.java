package Collections_EasyQuestions;

import java.util.Arrays;
import java.util.List;

public class StartswithLetter {

	public static void main(String[] args) {
	
		List<String> names =Arrays.asList("Apple","Anand","Kumar","Alice");
		
		List<String> count=	names.stream()
			.filter(name-> name.startsWith("A"))
			.toList();
	
		System.out.println(count);
		
	}
}
