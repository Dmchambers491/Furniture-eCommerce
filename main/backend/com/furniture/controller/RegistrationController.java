package com.furniture.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.furniture.model.*;
import com.furniture.service.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new UserModel());
		
		return mav;
	}
	
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST) 
		public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, 
				@ModelAttribute("user") UserModel user) {
		
		userService.register(user);
		
		return new ModelAndView("Welcome ", "firstname: ", user.getFirst_name());
			
		}
		
		
	
	
	
	

}
