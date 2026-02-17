package Collections_EasyQuestions;

import java.util.Arrays;
import java.util.List;

public class MultiplyNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		
		Integer multiplyNumbers =numbers.stream()
										.reduce(1,(a,b)->a*b);
		
		System.out.println(multiplyNumbers);
		
	}
	
}
