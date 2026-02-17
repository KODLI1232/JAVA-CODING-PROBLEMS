package Collections_EasyQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverage {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(5,10,15,20,25);
		
//		double average =numbers.stream()
//								.mapToInt(Integer::intValue)
//								.average()
//								.orElse(0.0);
//		
//		System.out.println(average);
		

		
		// using collectors
		
		double average =numbers.stream()
								.collect(Collectors.averagingInt(Integer::intValue));
		
		System.out.println(average);
		
		
	}
	
	
}
