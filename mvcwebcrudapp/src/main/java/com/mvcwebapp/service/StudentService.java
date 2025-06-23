package com.mvcwebapp.service;

import com.mvcwebapp.entity.Student;

public interface StudentService {
	//creating a abstract method to save student data
	public void saveStudent(Student student);
	
	public void deleteStudent(int id);
}