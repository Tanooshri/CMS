package com.example.CourseManagment.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.CourseManagment.Entity.Course;
import com.example.CourseManagment.Service.CourseServices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/course")


public class CourseController {
	
	
	@Autowired
	private CourseServices courseServices;
	
	
	@PostMapping(value="/save")
	public String saveCourse(@RequestBody Course courses) {
		
		
		courseServices.saveorUpdate(courses);
		return courses.get_id();
	}
	
	@GetMapping(value="/getAll")
	public Iterable<Course>getCourses(){
		
		
		
		return courseServices.listAll();
	}
	
	@PutMapping(value="/edit/{id}")
	private Course update(@RequestBody Course course,@PathVariable(name="id")String _id ) {
		course.set_id(_id);
		courseServices.saveorUpdate(course);
		return course;
	}
	@DeleteMapping(value="/delete/{id}")
	private void deleteCourse(@PathVariable("id") String _id) {
		courseServices.deleteCourse(_id);
		
	}
	
	@RequestMapping("/course/{id}")
	private Course getCourses(@PathVariable(name="id")String courseid) {
		return courseServices.getCourseByID(courseid);
	}
	
	

}
