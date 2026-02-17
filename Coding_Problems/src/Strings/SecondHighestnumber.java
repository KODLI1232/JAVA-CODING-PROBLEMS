package Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestnumber {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(12,4,9,1,7);
		
		Optional<Integer> secondhighst=numbers.stream()
									.sorted(Comparator.reverseOrder())
									.skip(1)
									.findFirst();
		
		System.out.println("secondhighst :"+secondhighst.get());
		
	}
}
