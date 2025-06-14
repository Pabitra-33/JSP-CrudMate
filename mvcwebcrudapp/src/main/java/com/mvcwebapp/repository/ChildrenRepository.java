package com.mvcwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvcwebapp.entity.Children;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Integer>{
	
	public List<Children> findByName(String name);
	
	public List<Children> findByAge(int age);
}