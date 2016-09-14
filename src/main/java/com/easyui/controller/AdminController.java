package com.easyui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/customlist")
	public String test(){
		return "manager1";
	}
	
	@RequestMapping("/list")
	public String listMenu(){
		return "admin";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public int get(){
		return 2;
	}
}
