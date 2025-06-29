package com.mvcwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvcwebapp.entity.Children;
import com.mvcwebapp.service.ChildrenService;

@Controller
@RequestMapping("/children")
public class ChildrenController {
	
	@Autowired
	private ChildrenService childrenService;//automatic dependency injection

	
	@GetMapping("/home")
	public String homePage() {
		return "index";//view names
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView Page(ModelAndView modView) {
		modView.addObject("msg", "Welcome To Our Application Home");
		modView.setViewName("register");//setting the view name to modelview object
		return modView;
	}
	
	
	@PostMapping("/register")
	public ModelAndView registerChild(Children child, ModelAndView mv) {
		mv.addObject("childdata", child);//adding model data
		
		childrenService.saveChildren(child); //saving the children's data coming from fronted
		
		mv.setViewName("profile");//setting view name
		return mv;
	}
	
	@GetMapping("/getbyname")
	public ModelAndView getChildrenByName(@RequestParam String name, ModelAndView mv){
		mv.addObject("childname", name);//adding model data
		
		List<Children> childrens = childrenService.getByUsingName(name);
		System.out.println(childrens);
		
		mv.setViewName("profile");//setting the view name
		return mv;
	}
	
	
	@GetMapping("/getbyage/{age}")
	public String getChildrenByName(@PathVariable int age, Model model){
		model.addAttribute("childage", age);//adding the model data as key-value pair
		
		List<Children> childrens = childrenService.getByUsingAge(age);
		System.out.println(childrens);
		return "profile";//returning the view name
	}
}