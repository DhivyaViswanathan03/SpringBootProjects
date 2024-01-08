package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/test")
public class FirstController {
	
	@GetMapping(value="/report")
	public String getReport(Map<String,Object> obj) {
		System.out.println("FirstController.getReport()");
		return "display";
	}
	
	
}
