package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindEmptyString {

	public static void main(String[] args) {
		
		List<String> strings=Arrays.asList("","ksk","","tsk","");
		
		Optional<String> result=strings.stream()
									.filter(s->!s.isEmpty())
									//.findFirst();
									.findAny();
		
		System.out.println(result.get());
		
		long count=strings.stream()
				.filter(s->!s.isEmpty())
				.count();
		System.out.println("No of Non-Empty Strings :"+count);
		
		long count1=strings.stream()
				.filter(s->s.isEmpty())
				.count();
		
		System.out.println("No of Empty Strings :"+count1);
	}
}
