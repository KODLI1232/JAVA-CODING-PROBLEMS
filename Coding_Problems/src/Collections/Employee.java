package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees=Arrays.asList(
				
				new Employee("KSK", 1116.16),
				new Employee("TSK", 1202.17),
				new Employee("DSK", 7852.69),
				new Employee("CSK", 5001.23)
				);
		
		Employee result=employees.stream()
									.max(Comparator.comparing(e->e.salary))
									.get();
		
		System.out.println(result.name+":"+result.salary);
		
	}
	

}
