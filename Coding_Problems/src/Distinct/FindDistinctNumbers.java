package Distinct;

import java.util.Arrays;
import java.util.List;

public class FindDistinctNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(1,2,4,2,3,5,2,6,7);
		
		List<Integer> distinct=numbers.stream()
										.distinct()
										.sorted()
										.toList();
		
		System.out.println(distinct);
		
	}
}
