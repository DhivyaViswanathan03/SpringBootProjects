package in.ineuron.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.inneuron.model.Employee;

@Controller
public class FirstController {
	
	@GetMapping
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping(value="/report")
	public String getReport(Map<String,Object> model) {
//		model.put("name", "divs");
//		model.put("age", 30);
//		model.put("address", "eriyur");
//		
//		String[] countryNames=new String[] {"IND","USA","RUSSIA","UK"};
//		model.put("countryNames", countryNames);
//		
//		List<String> subjectsList = List.of("JAVA","JEE","SPRING","HIBERNATE");
//		model.put("subjectsList", subjectsList);
//		
//		Set<Long> mobileNos=Set.of(999888777L,777888555L,222555444L,333555444L);
//		model.put("mobileNos", mobileNos);
//		
//		Map<String, Integer> personalDetails = Map.of("aadharNo",7778886,"panNo",7776668,"voteId",5558478);
//		model.put("personalDetails", personalDetails);
		
		List<Employee> empList = List.of(new Employee(10,"divs","SE",23000.4F),new Employee(11, "priya", "TESTER", 43000.5F));
		model.put("empList", empList);
		
		Employee emp=new Employee(3,"viswa","farmer",1000.0F);
		model.put("emp", emp);
		
		return "display";
	}
	
	
}
