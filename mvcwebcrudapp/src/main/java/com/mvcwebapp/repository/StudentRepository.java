package com.mvcwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvcwebapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	//this layer is used to interact with the database
}