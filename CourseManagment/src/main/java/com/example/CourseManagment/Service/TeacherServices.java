package com.example.CourseManagment.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.CourseManagment.Entity.Teacher;

import com.example.CourseManagment.Repo.TeacherRepo;

public class TeacherServices {
@Autowired
private TeacherRepo repo;
	public Iterable<Teacher> listAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	public void saveorUpdate(Teacher teacher) {
		// TODO Auto-generated method stub
		repo.save(teacher);
		
	}

	

	public Teacher getTeacherById(String _id) {
		// TODO Auto-generated method stub
		return repo.findById(_id).get();
	}

	public void deleteTeacherById(String _id) {
		// TODO Auto-generated method stub
		repo.deleteById(_id);
		
	}

	

}
