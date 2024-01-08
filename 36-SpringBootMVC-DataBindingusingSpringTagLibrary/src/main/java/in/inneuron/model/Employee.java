package in.inneuron.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer eno;
	private String ename="divs";
	private String edesg;
	private Float esalary;
	
	public Employee() {
		System.out.println("Employee ZERO PARAM is called...");
	}
	

}
