package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.inneuron.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String showHomePage(@ModelAttribute("emp") Employee employee) {
		return "home";
	}
	
	@PostMapping("/register")
	public String registerEmpDetails(Map<String,Object> model,@ModelAttribute("emp")Employee employee) {
		System.out.println("Emplyee Details:"+employee);
		model.put("employee", employee);
		
		return"result";
	}

}
