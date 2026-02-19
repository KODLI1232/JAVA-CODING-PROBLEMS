package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		
		System.out.print("Even numbers :");
		
		numbers.forEach(n->{
			if(n%2==0)
				System.out.println(n);
		});
		
		System.out.print("Odd Numbers :");
		numbers.forEach(n->{
			if(n%2 !=0)
				System.out.println(n);
		});
	}
	

}
