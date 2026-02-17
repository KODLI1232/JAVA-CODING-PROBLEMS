package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Students {
	
	String name;
	String dept;
	
	public Students(String name,String dept) {
		this.name=name;
		this.dept=dept;
	}
	

	public static void main(String[] args) {
		
		List<Students> students=Arrays.asList(
							new Students("KSK", "IOT"),
							new Students("TSK", "MECH"),
							new Students("RSR", "IOT"),
							new Students("ABK", "BPHARM")
				);
		
		Map<String,List<Students>> result=students.stream()
									.collect(Collectors.groupingBy(s->s.dept));
									
		result.forEach((dept,list)->{
			System.out.println(dept);
			list.forEach(s->System.out.println(" "+s.name));
		});
	}
}
