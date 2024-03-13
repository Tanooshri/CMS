package com.example.CourseManagment.Entity;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.CourseManagment.CourseType;
import com.example.CourseManagment.LearningMode;

@Document(collection = "student")

public class Course {
	
	@Id
	private String _id;
	private String name;
    private String subject;
    private int chapters;
    private int numberOfClasses;
    private CourseType type;
    private LearningMode learningMode;
    

	public Course(String _id, String name, String subject, int chapters, int numberOfClasses, CourseType type,
			LearningMode learningMode) {
		super();
		this._id = _id;
		this.name = name;
		this.subject = subject;
		this.chapters = chapters;
		this.numberOfClasses = numberOfClasses;
		this.type = type;
		this.learningMode = learningMode;
	}
    public Course() {
		
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public LearningMode getLearningMode() {
		return learningMode;
	}

	public void setLearningMode(LearningMode learningMode) {
		this.learningMode = learningMode;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", subject=" + subject + ", chapters=" + chapters + ", numberOfClasses="
				+ numberOfClasses + ", type=" + type + ", learningMode=" + learningMode + "]";
	}
	
	
	
	
	
	

}
