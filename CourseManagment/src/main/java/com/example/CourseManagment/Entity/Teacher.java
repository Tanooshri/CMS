package com.example.CourseManagment.Entity;

import org.springframework.data.annotation.Id;

public class Teacher {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Subject subject;
	public String getId() {
		return id;
	}
	public void setId(String _id) {
		this.id = _id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher() {
		super();
	}
	public Teacher(String firstName, String lastName, String email, Subject subject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.subject = subject;
	}

}
