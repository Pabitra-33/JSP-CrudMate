package com.mvcwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcwebapp.entity.Children;
import com.mvcwebapp.repository.ChildrenRepository;

@Service
public class ChildrenServiceImplementation implements ChildrenService {

	@Autowired
	private ChildrenRepository chRepository;
	
	
	@Override
	public void saveChildren(Children child) {
		chRepository.save(child);
	}

	
	@Override
	public List<Children> getByUsingName(String name) {
		return chRepository.findByName(name);
	}

	
	@Override
	public List<Children> getByUsingAge(int age) {
		return chRepository.findByAge(age);
	}
}