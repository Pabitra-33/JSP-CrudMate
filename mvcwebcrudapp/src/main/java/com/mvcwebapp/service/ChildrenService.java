package com.mvcwebapp.service;

import java.util.List;

import com.mvcwebapp.entity.Children;

public interface ChildrenService {
	
	public void saveChildren(Children child);
	
	public List<Children> getByUsingName(String name);
	
	public List<Children> getByUsingAge(int age);
}