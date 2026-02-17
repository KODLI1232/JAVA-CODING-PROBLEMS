package Collections;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class coagnizantQues_1 {
	public static void main(String[] args) {
		
	List<Student_1> students =Arrays.asList(new Student_1(45, "KODLI","KSK"),
											new Student_1(55, "KL", "RAHUL"),
											new Student_1(60, "SAI", "KIRAN"),
											new Student_1(30, "DSK", "SRAVAN"),
											new Student_1(90, "RAJ", "LION")
											);
				
	List<String> list=students.stream()
								.filter(student->student.getRollNo()>50)
								.map(student->student.getFirstName()+" "+student.getLasstName())
								.collect(Collectors.toList());
	
	list.forEach(System.out::println);
	
	
}

}