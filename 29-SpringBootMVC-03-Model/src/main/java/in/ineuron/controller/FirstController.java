package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMessageService;

@Controller
public class FirstController {
	
	@Autowired
	private IWishMessageService service;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getLoginpage() {
		return "index";
	}
	
//	@RequestMapping(value="/wish",method=RequestMethod.GET)
//	public String getWishMessage(Model model) {
//		String msg=service.getWishMessage();
//		model.addAttribute("msg", msg);
//		return "display";
//	}
//	
//	@RequestMapping(value="/wish",method=RequestMethod.GET)
//	public String getWishMessage(Map<String,String> model) {
//		String msg=service.getWishMessage();
//		model.put("msg", msg);
//		return "display";
//	}
	
//	@RequestMapping(value="/wish",method=RequestMethod.GET)
//	public void getWishMessage(Map<String,String> model) {
//		String msg=service.getWishMessage();
//		model.put("msg", msg);
//	}
//	
//	@RequestMapping(value="/wish",method=RequestMethod.GET)
//	public void getWishMessage(HttpServletResponse response) throws IOException {
//		String msg=service.getWishMessage();
//		PrintWriter out = response.getWriter();
//		out.println("<b>Wish message: "+msg+"</b");
//	}
	

	@RequestMapping(value="/wish",method=RequestMethod.GET)
	public Map<String,String> getWishMessage(){
		String msg=service.getWishMessage();
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("msg", msg);
		return map;
	}

}
