package com.furniture.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.furniture.model.*;
import com.furniture.service.*;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new LoginModel());
		
		return mav;
		
		
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") LoginModel login) {
		ModelAndView mav = null;
		
		UserModel user = userService.validateUser(login);
		
		if (null != user) {
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", user.getFirst_name());
		}
		
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or password is wrong!!");
			
		}
		
		return mav;
	}
	
	

}
