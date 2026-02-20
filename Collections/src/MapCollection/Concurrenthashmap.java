package MapCollection;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println(map);
		
		System.out.println("value of A :"+map.get("A"));
		System.out.println("After removal of C :"+map.remove("C"));
		System.out.println("Size of map :"+map.size());
		
		map.putIfAbsent("D", 4);
		System.out.println("After putIfAbsent :"+map);
		
		// puting one map to another map
		
		ConcurrentHashMap<String, Integer> map1=new ConcurrentHashMap<>(map);
		
		System.out.println("inserting map to another map :"+map1);
		
		map.clear();
		System.out.println(map);
		
	}

}
