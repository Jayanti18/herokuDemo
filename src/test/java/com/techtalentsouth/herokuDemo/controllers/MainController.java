package com.techtalentsouth.herokuDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@GetMapping("/")
	public ModelAndView indexMethod() {
//	creating method modelandview and  @Getmapping used to call index file 
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
