package com.rajtech.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello") //http://localhost:8080/hello
	public ModelAndView getHelloMessage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Hello Raj Technologies");
		mav.setViewName("hello");
		return mav;
	}
	
//	@RequestMapping("/greet") //http://localhost:8080/greet
//	public ModelAndView sayGreeting() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg","Good Evening");
//		mav.setViewName("hello");
//		return mav;

	// Another easy method to map the requests
	@GetMapping("/greet")	//http://localhost:8080/greet
	public String sayGreeting(Model model) {
		model.addAttribute("msg","Good Evening");
		return "hello";
		
	}
}
