package com.home.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	//@ResponseBody
	@RequestMapping("/MyHome")
	public String myHome(Model model) {
		//sending data to view
		String myName = "Shilpa";
		model.addAttribute("myNameValue",myName);
		return "welcome";
	}
	
	@RequestMapping("/processOrder")
	public String ProcessOrder(HttpServletRequest request,Model model) {
		String userEnteredValue = request.getParameter("FoodType");
		model.addAttribute("uservalue",userEnteredValue);
		return "process-order";
	}
}
