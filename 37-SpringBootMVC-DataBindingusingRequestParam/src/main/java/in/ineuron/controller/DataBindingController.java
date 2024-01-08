package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {
	
	@GetMapping("/data")
	public String dataBind(Map<String,Object>map,@RequestParam("sno") Integer sno,@RequestParam("sname")String sname) {
		System.out.println("SNO is:"+sno);
		System.out.println("SNAME is:"+sname);
		return "show_data";
	}
	
	@GetMapping("/data1")
	public String dataBind1(Map<String,Object>map,@RequestParam Integer sno,@RequestParam(defaultValue ="mouli" ) String sname) {
		System.out.println("SNO is:"+sno);
		System.out.println("SNAME is:"+sname);
		return "show_data";
	}


}
