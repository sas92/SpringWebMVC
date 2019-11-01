package com.sas.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class RoomManagerController {
	@GetMapping
	public String welcome(ModelMap modelMap) {
		modelMap.addAttribute("greeting", "Welcome to Room Manager");
		return "welcome";
	}

	@GetMapping(value = "/user/{username}")
	public String welcomeUser(ModelMap modelMap, @PathVariable String username) {
		modelMap.addAttribute("greeting", "Welcome " + username);
		return "welcome";
	}
	
	@ResponseBody
	@GetMapping(value = "/test")
	public String welcomeTest() {
		return "Server is running..";
	}
}
