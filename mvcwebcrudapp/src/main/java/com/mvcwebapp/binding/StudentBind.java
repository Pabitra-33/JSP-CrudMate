package com.mvcwebapp.binding;

import java.util.Arrays;

//creating this class to bind the data from the fronted data in this class attributes for later use
public class ChildrenBind {

	private int id;
	private String name;
	private String gender;
	private int age;
	private String courses;
	private String[] timings;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	
	
	@Override
	public String toString() {
		return "ChildrenBind [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", courses="
				+ courses + ", timings=" + Arrays.toString(timings) + "]";
	}
}