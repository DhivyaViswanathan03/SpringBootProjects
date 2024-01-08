package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}
	
	
	@GetMapping(value={"/report","/report1","/report2"})
	public String getReport(Map<String,Object> obj) {
		System.out.println("FirstController.getReport()");
		return "display";
	}
	
	
}
