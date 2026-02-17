package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Studnets {
	
	String name;
	String password;
	
	public Studnets(String name,String password) {
		this.name=name;
		this.password=password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		
		List<Studnets> students=Arrays.asList(
						new Studnets("KSK", "ksk"),
						new Studnets("TSK", "tsk"),
						new Studnets("DSK", "dsk"),
						new Studnets("KSK", "ksk")
				);
				
		@SuppressWarnings("unused")
		Map<String,String> userMap=students.stream()
											.collect(Collectors.toMap(
													Studnets::getName,
													Studnets::getPassword,
													(existing,duplicate)->existing
												));
				
		System.out.println(userMap);
	}
	

}
