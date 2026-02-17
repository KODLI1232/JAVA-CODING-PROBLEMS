package Collections;

import java.util.Arrays;
import java.util.List;

public class StringtoUpperCase {
	public static void main(String[] args) {
		
		List<String> strings=Arrays.asList("ksk","tsk","csk","dsk","klr");
		
		List<String> result= strings.stream()
									.map(String::toUpperCase)
									.toList();
		
		System.out.println(result);
	}

}



