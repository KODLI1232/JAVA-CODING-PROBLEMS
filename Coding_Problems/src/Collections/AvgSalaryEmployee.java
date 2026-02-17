package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvgSalaryEmployee {
	
	double salary;
	int age;
	
	public AvgSalaryEmployee(double salary,int age) {
		this.salary=salary;
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		List<AvgSalaryEmployee> employees=Arrays.asList(
				
											new AvgSalaryEmployee(500.21,15),
											new AvgSalaryEmployee(568.69,54),
											new AvgSalaryEmployee(786.86,35)
											);
		
		double avgSalary=employees.stream()
									.collect(Collectors.averagingDouble(e->e.salary));
			
		System.out.println("Avg salary of EMployee: "+avgSalary);
		
		Double avgAge=employees.stream()
				.collect(Collectors.averagingInt(a->a.age));
		
		System.out.println("Avg age of employees: "+avgAge);
				
	
	}

}
