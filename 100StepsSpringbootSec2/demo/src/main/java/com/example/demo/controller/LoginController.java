package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage(ModelMap Model){
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage( ModelMap Model, @RequestParam String name , @RequestParam String password ){
	boolean isValidUser =	service.validateUser(name, password);
	
	if (!isValidUser){
		Model.put("errorMessage", "Invalid Credentials");
		return "login";
	}
		Model.put("name", name);
		Model.put("password", password);
		return "welcome";
		
		
	}
}
