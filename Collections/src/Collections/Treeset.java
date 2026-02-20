package Collections;

import java.util.TreeSet;

//TreeSet is a class in Java that implements the SortedSet interface from the Java Collections Framework.
// case insensitive : B is different of b
public class Treeset {
	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("KSK");
		set.add("DSK");
		set.add("TSK");
		set.add("CSK");
		
		//set.add(null);  // raises exception : NullPointerException
		
		System.out.println(set);  // [CSK, DSK, KSK, TSK]
		
		set.add("kSK");
		
		System.out.println(set); //[CSK, DSK, KSK, TSK, kSK]  - case insensitive
		
		System.out.println(set.size());
		
		System.out.println(set.contains("KSK")); // true
		
		System.out.println(set.first());
		
		System.out.println(set.last());
		System.out.println(set.getLast());
		
		String name="KSK";
		System.out.println("Higher than KSK :"+set.higher(name));
		
		set.remove("DSK");
		
		System.out.println("After removing"+set);
		
		
		TreeSet<Integer> nums= new TreeSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(5);
		nums.add(4);
		
		System.out.println(nums);
		
		int n1=3;
		
		System.out.println(nums.higher(n1));
		
//		nums.removeIf(n->n%2==0);
//		System.out.println("After removing element with an expression :"+nums);
		
		// To remove first and last element
		
		nums.pollFirst();
		System.out.println("pollFirst"+nums);
		
		nums.pollLast();
		System.out.println("pollLast"+nums);
		
	}

}
