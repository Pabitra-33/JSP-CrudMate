package com.mvcwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvcwebapp.entity.Children;

@Controller
@RequestMapping("/children")
public class ChildrenController {

	@GetMapping("/home")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/welcome")
	public ModelAndView Page(ModelAndView modView) {
		modView.addObject("msg", "Welcome To Our Application Home");
		modView.setViewName("register");
		return modView;
	}
	
	@PostMapping("/register")
	public ModelAndView registerChild(Children child, ModelAndView mv) {
		mv.addObject("childdata", child);
		mv.setViewName("profile");
		return mv;
	}
}