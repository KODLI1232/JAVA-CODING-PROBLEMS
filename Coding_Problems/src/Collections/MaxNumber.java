package Collections;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,24,75,36,69);
		
	int max=	numbers.stream()
				.max(Integer::compareTo)
				.get();
		
	System.out.println(max);
		
	}

}
