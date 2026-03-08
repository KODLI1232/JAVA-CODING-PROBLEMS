package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

	public static void main(String[] args) {
		
	List<Integer> list= Arrays.asList(1,25,41,3,69);
		
	Optional<Integer> result=list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();

	
	System.out.println(result.get());
	}
	

}
