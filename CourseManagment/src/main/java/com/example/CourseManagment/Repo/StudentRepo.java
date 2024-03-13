package com.example.CourseManagment.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.CourseManagment.Entity.Student;

public interface StudentRepo extends MongoRepository<Student,String> {

}
