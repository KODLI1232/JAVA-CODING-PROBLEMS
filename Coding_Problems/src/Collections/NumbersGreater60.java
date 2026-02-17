package Collections;

import java.util.Arrays;
import java.util.List;

public class NumbersGreater60 {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,69,78,30,101,95,88);
		
		long count=numbers.stream()
							.filter(n->n>60)
							.count();
		
		System.out.println(count);
		
		List<Integer> number=numbers.stream()
									.filter(n->n>60)
									.toList();
		
		System.out.println(number);
		
	}
}
