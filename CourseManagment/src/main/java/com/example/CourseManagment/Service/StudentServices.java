package com.example.CourseManagment.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.CourseManagment.Entity.Student;

import com.example.CourseManagment.Repo.StudentRepo;


public class StudentServices {
@Autowired
private StudentRepo repo;

	public Iterable<Student> listAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	public void saveorUpdate(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}

	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void deleteStudentById(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
