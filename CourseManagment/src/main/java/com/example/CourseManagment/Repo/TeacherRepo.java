package com.example.CourseManagment.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.CourseManagment.Entity.Teacher;

public interface TeacherRepo extends MongoRepository<Teacher,String> {

	

}
