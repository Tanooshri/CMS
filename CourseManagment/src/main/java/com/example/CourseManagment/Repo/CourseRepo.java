package com.example.CourseManagment.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.CourseManagment.Entity.Course;

public interface CourseRepo extends MongoRepository<Course,String> {

}
