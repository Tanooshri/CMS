package com.example.CourseManagment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.CourseManagment.Entity.Student;

import com.example.CourseManagment.Service.StudentServices;


public class StudentController {
	@Autowired
	private StudentServices studentService;

	public StudentController(StudentServices studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	//handler method to handle list student and return model and view
	@GetMapping(value="/student/getAll")
	public Iterable<Student>getstudents(){
		
		
		
		return studentService.listAll();
	}
	

	@PostMapping(value="/student/save")
	public String saveStudent(@RequestBody Student student) {
		
		
		studentService.saveorUpdate(student);
		return student.getId();
	}
	
	@PutMapping(value="/student/edit/{id}")
	private Student update(@RequestBody Student student,@PathVariable(name="id")String id ) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		
		
		studentService.saveorUpdate(student);
		return student;
	}
	
	
	@DeleteMapping(value="/student/delete/{id}")
	private void deleteStudent(@PathVariable("id") String id) {
		studentService.deleteStudentById(id);
		
		
	}
		

}
