package com.mvcwebapp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvcwebapp.binding.StudentBind;
import com.mvcwebapp.entity.Student;
import com.mvcwebapp.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//we need to create three methods:
	//To show the form,
	//To save data, 
	//To show students data.
	
	@GetMapping("/register")
	public String loadForm(Model model) {
		formData(model);//calling the method
		
		return "form";
	}

	//to reduce writing boiler-code we have created a method and call the method when needed.
	private void formData(Model model) {
		//creating list of courses and list of timings to send back to fronted
		List<String> courses = new ArrayList<>();
		courses.add("--Select--");
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Devops");
		
		List<String> timings = new ArrayList<>();
		timings.add("Morning");
		timings.add("Afternoon");
		timings.add("Evening");
		
		//creating StudentBind class object.
		StudentBind studentbind = new StudentBind();
		
		//now adding them to the view through model reference 
		model.addAttribute("courseslist", courses);
		model.addAttribute("timingslist", timings);
		model.addAttribute("bindstudent", studentbind);
	}
	
	
	@PostMapping("/submit")
	public String saveStudentData(StudentBind sb, Model model) {
		formData(model);//calling the method again to give the data from the controller again.
		
		Student st = new Student();//created the object of the entity class
		
		BeanUtils.copyProperties(sb, st);//copying the binding object properties to entity object.
		st.setTimings(Arrays.toString(sb.getTimings()));//converting the array of timings to string.
		
		studentService.saveStudent(st);
		
		System.out.println("Method tiggered");
		model.addAttribute("msg", "Data Saved");
		return "form";
	}
	
	
	@DeleteMapping("/deleteByid")
	public String deleteData(@RequestParam int id) {
		studentService.deleteStudent(id);
		return "Data Deleted";
	}
}