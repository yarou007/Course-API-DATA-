package com.example.demo.lesson;

import com.example.demo.course.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {

	@Id
	private String id;
	private String name;
	private String desc;
	
	@ManyToOne
	private Course course;
	
	public Lesson() {
		
	}
	public Lesson(String id, String name, String desc, String courseId,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.course = new Course(courseId,"","",topicId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
