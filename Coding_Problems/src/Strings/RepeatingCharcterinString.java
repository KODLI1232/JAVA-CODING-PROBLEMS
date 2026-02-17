package Strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharcterinString {
	
	public static void main(String[] args) {
		
		String input="Success";
		
		Map<Character, Long> map=input.chars()
									.mapToObj(c->(char)c)
									.collect(Collectors.groupingBy(Function.identity(),
									Collectors.counting()
											
											));
		
		System.out.println(map);
	}

}
