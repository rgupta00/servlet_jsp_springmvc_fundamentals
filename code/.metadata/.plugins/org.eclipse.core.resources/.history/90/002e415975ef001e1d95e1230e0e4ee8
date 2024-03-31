package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//Back controller BL
@Controller
public class HelloController {

	@GetMapping(path="hello")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("show");
		mv.addObject("data", "You all are champs!");//it automatically goes to the req scope 
		
		return mv;
	}
}
