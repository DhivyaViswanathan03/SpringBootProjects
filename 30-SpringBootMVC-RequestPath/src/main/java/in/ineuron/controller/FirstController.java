package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}
	
	@RequestMapping(value="/REPORT",method=RequestMethod.GET)
	public String getReport(Map<String,Object> obj) {
		System.out.println("FirstController.getReport()");
		return "";
	}
	
	@RequestMapping(value="/report",method=RequestMethod.GET)
	public String getReport1(Map<String,Object> obj) {
		System.out.println("FirstController.getReport1()");
		return "";
	}
}
