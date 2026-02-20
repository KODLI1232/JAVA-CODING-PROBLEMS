package MapCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConversionSetToArray {
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Custard");
		
		System.out.println("Set"+set);
		
		System.out.println("set to Array");
		
		String[] toarray = set.toArray(new String[0]);
		
		System.out.println("Array :"+String.join(",", toarray));
		
		// now Array to set
		
		System.out.println("Array to Set");
		
		
		
		String[] arr= {"Apple","Ball","Cat"};
		
		Set<String> set2=new HashSet<>(Arrays.asList(arr));
		
		System.out.println("Set"+set2);
		
	}

}
