package com.example.CourseManagment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.CourseManagment.Entity.Teacher;
import com.example.CourseManagment.Service.TeacherServices;



@Controller
public class TeacherController {
	@Autowired
	private TeacherServices teacherService;

	public TeacherController(TeacherServices teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	
	//handler method to handle list student and return model and view
	@GetMapping(value="/teacher/getAll")
	public Iterable<Teacher>getteachers(){
		
		
		
		return teacherService.listAll();
	}
	

	@PostMapping(value="/teacher/save")
	public String saveTeacher(@RequestBody Teacher teacher) {
		
		
		teacherService.saveorUpdate(teacher);
		return teacher.getId();
	}
	
	@PutMapping(value="/teacher/edit/{id}")
	private Teacher update(@RequestBody Teacher teacher,@PathVariable(name="id")String _id ) {
		Teacher existingInstrcutor = teacherService.getTeacherById(_id);
		existingInstrcutor.setId(_id);
		existingInstrcutor.setFirstName(teacher.getFirstName());
		existingInstrcutor.setLastName(teacher.getLastName());
		existingInstrcutor.setEmail(teacher.getEmail());
		existingInstrcutor.setSubject(teacher.getSubject());
		
		
		teacherService.saveorUpdate(teacher);
		return teacher;
	}
	
	
	@DeleteMapping(value="/teacher/delete/{id}")
	private void deleteTeacher(@PathVariable("id") String _id) {
		teacherService.deleteTeacherById(_id);
		
		
	}
		

}
