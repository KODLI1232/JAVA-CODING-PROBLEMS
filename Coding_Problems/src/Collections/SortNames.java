package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNames {
	
	String name;
	
	public SortNames(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		List<SortNames> names=Arrays.asList(
									new SortNames("KSK"),
									new SortNames("TSK"),
									new SortNames("CSK")
				);
		
		names.stream()
			.sorted(Comparator.comparing(s->s.name))
			.forEach(s->System.out.println(s.name));
	}

}
