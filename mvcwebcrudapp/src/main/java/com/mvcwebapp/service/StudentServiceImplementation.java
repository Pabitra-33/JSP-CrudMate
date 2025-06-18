package com.mvcwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcwebapp.entity.Student;
import com.mvcwebapp.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
}