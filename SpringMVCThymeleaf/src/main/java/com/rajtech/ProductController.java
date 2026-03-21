package com.rajtech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String loadProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	
	@PostMapping("/addProduct")
	public String handleProduct(@Valid Product p,BindingResult result,Model model) {
		if(result.hasErrors())
		{
			return "addProduct";
		}
		else
		{
			model.addAttribute("msg","Product Saved");
		}
		return "addProduct";
	}
}

