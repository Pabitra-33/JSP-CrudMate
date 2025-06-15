package com.mvcwebapp.service;

import java.util.List;

import com.mvcwebapp.entity.Children;

public interface ChildrenService {
	
	public void saveChildren(Children child);
	
	//custom method created
	public List<Children> getByUsingName(String name);
	
	public List<Children> getByUsingAge(int age);
}