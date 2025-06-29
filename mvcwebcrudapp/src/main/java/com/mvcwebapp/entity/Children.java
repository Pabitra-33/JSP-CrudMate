package com.mvcwebapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Children {

	@Id
	private int id;
	private String name;
	private int age;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "Children [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}