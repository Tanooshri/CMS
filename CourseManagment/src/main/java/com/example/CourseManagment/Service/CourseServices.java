package com.example.CourseManagment.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.CourseManagment.Entity.Course;
import com.example.CourseManagment.Repo.CourseRepo;


@Service

public class CourseServices {
	
	@Autowired
	private CourseRepo repo;

	public void saveorUpdate(Course courses) {
		// TODO Auto-generated method stub
		
		repo.save(courses);
	}

	public Iterable<Course> listAll() {
		// TODO Auto-generated method stub
		
		return this.repo.findAll();
	}

	public void deleteCourse(String _id) {
		// TODO Auto-generated method stub
		repo.deleteById(_id);
	}

	public Course getCourseByID(String courseid) {
		// TODO Auto-generated method stub
		return repo.findById(courseid).get();
	}

	
}
