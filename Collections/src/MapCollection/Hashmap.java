package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> numMap=new HashMap<>();
		
		numMap.put("One", 1);
		numMap.put("Two", 2);
		numMap.put("Three", 3);
		
		// add a new key with putIfAbsent
		
		numMap.putIfAbsent("Four",4);
		
		System.out.println(numMap);
	}

}
