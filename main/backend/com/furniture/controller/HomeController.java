package com.furniture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/index")
	public String check() {
		return "index";
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "contact";
	}
}
