package Collections;

import java.util.Arrays;

public class CoagnizantQUestion {

	public static void main(String[] args) {
		
		// using sorting
		
		int[] array= {10,-8,-1,6,2};
		
		Arrays.sort(array);
		
		System.out.println("Second smallest: "+array[1]);
		System.out.println("Second largest:"+array[array.length-2]);

		}
}
