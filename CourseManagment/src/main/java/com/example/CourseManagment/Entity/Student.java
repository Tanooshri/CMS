package com.example.CourseManagment.Entity;

import org.springframework.data.annotation.Id;




	public class Student{

	@Id
	private String id;
	private String firstName;
	private String lastName;
    private String email;
    private Course courses;
    
		
		public Student() 
		{
		
		}
		
		
		public Student(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
		
		
		public Student( String firstName,String lastName, String email, Course listOfCourses) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.courses = listOfCourses;
		}


		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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


		public Course getCourses() {
			return courses;
		}


		public void setCourses(Course courses) {
			this.courses = courses;
		}
		
		
		

	

}
