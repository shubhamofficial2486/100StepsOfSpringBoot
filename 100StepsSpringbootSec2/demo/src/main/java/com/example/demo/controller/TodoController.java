package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.Todoservice;


	@Controller
	@SessionAttributes("name")
	public class TodoController {
		
		@Autowired
		Todoservice service;
		
		@InitBinder
		public void intiBinder(WebDataBinder binder){
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			binder.registerCustomEditor(Date.class, new CustomDateEditor(
					dateFormat, false));
		}
		
		@RequestMapping(value="/list-todos", method=RequestMethod.GET)
		public String showTodo(ModelMap Model){
			String name =(String) Model.get("name");
			Model.put("todos", service.retrieveTodos("shubham"));
			return "list-todos";
		}
		
		@RequestMapping(value="/add-todo", method=RequestMethod.GET)
		public String showAddTodoPage(ModelMap Model){
			return "todo";
		}
		
		@RequestMapping(value="/add-todo", method=RequestMethod.POST)
		public String addTodo(ModelMap Model, @RequestParam String desc){
			service.addTodo((String) Model.get("name"), desc, new Date(), false);
			return "list-todos";
		}
		

	}

