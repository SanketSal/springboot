package com.rajtech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String getHelloMessage(Model model) {
		model.addAttribute("msg", "Hello Thymeleaf App");
		return "hello";
	}
}
