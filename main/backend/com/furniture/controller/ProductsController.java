package com.furniture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

	@RequestMapping("/products")
	public String check() {
		return "products";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
}
