package Collections;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(15,3,54,3,54);
		
		List<Integer> unique=numbers.stream()
									.distinct()
									.toList();
		
		System.out.println(unique);
	}

}
