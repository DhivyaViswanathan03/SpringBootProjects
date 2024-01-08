package in.ineuron.component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	private String name;
	private Long id;
	
	private String[] skills;
	
	private List<String> teamMembers;
	
	private Set<Long> phoneNumbers;
	
	private Map<String,Object> idDetails;
	
	
	private Company com;
	

	public void setCom(Company com) {
		this.com = com;
	}

	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}

	public void setId(Long id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
		System.out.println("Employee.setSkills()");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", skills=" + Arrays.toString(skills) + ", teamMembers="
				+ teamMembers + ", phoneNumbers=" + phoneNumbers + ", idDetails=" + idDetails + ", com=" + com + "]";
	}
	
	
}
