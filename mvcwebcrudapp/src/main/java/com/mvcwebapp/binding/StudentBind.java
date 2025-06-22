package com.mvcwebapp.binding;

import java.util.Arrays;

//creating this class to bind the data from the fronted data in this class attributes for later use.
//binding class
public class StudentBind {

	private Integer sid;
	private String name;
	private String email;
	private String gender;
	private String courses;
	private String[] timings;//as we want our user to store multiple timings from the fronted
	
	
	//getters and setters
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
	
	//toString method
	@Override
	public String toString() {
		return "StudentBind [sid=" + sid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", courses="
				+ courses + ", timings=" + Arrays.toString(timings) + "]";
	}
}