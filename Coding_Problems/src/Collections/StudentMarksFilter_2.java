package Collections;

import java.util.Arrays;
import java.util.List;

public class StudentMarksFilter_2 {
	
	public static void main(String[] args) {
		
		List<StudentsMarks60_2> list =Arrays.asList(
				new StudentsMarks60_2(60,"Rahul"),
				new StudentsMarks60_2(65, "KSK"),
				new StudentsMarks60_2(79, "TSK"),
				new StudentsMarks60_2(69, "DSK"),
				new StudentsMarks60_2(30, "CSK")
				);
		
		list.stream()
			.filter(s->s.getMarks()>60)
			.forEach(s-> System.out.println(s.getName()));
	}
}
