package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping(value="/wish",method=RequestMethod.GET)
	public ModelAndView getWishMessage() {
		String msg=service.getWishMessage();
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg",msg);
		mv.setViewName("display");
		return mv;
	}

}
