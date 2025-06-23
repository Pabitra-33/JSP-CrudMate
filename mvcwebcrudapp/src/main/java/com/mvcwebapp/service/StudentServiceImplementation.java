package com.mvcwebapp.service;

import java.util.List;

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

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> listSts() {
		return studentRepository.findAll();
	}
}