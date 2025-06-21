package com.mvcwebapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//this is our entity class to create table and perform operation
@Entity
@Table(name = "student_data")
public class Student {

	@Id
	private Integer sid;
	private String name;
	private String email;
	private String gender;
	private String courses;
	private String timings;
	
	
	//getters and setters
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", courses="
				+ courses + ", timings=" + timings + "]";
	}
}