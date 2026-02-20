package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		
		System.out.println(Collections.frequency(list, "Apple"));
		
		List<String> list1=new ArrayList<>();
		list1.add("Apple");
		list1.add("Apple");
		list1.add("Apple");
		list1.add("Ball");
		list1.add("Sat");
		
		System.out.println(Collections.disjoint(list, list1));
	}

}
