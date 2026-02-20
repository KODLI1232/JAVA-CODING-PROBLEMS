package Collections;

import java.util.*;

public class hashset {
	public static void main(String[] args) {
		
		// Syntax : HashSet<T> set=new HashSet<>();
		
		// HashSet does not allow duplicate values. If you try to add the same value again, it will not replace the old value.
		
		HashSet<String> set = new HashSet<>();
		
		set.add("KSK");
		set.add("TSK");
		set.add("CSK");
		System.out.println(set); // prints set: [KSK, CSK, TSK]
		
		for(String ele:set) {
			System.out.println(ele);  // prints as elements  KSK
															//CSK
															//TSK
		}
		
		set.remove("KSK");
		
		System.out.println(set); // [CSK, TSK]
		
		set.removeIf(s->s.startsWith("C"));
		
		System.out.println(set);
		
		set.add(null);
		
		System.out.println(set);  // adds null values only one : [null, CSK, TSK]
		
	//	you can make a HashSet thread-safe by using the Collections.synchronizedSet() method.
		
		Set<String> synchronize = Collections.synchronizedSet(set);
		
		System.out.println(synchronize);
		

}

}