package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	
	public List<Course> GetAllCourses(String id){
		//return topics;
		List<Course> course = new ArrayList<>();
		courseRepository.findByTopicId(id) /// fetching all topics a travers findAll()
		.forEach(course::add);  /// Kol ligne besh talkah besh tzidou lil topics ::add --> lambda expression (child method)
		return course;
	}
	
	public Course getCourse(String id) {
	//	return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		/// if the rows exist gets update else taamel insertion :) 
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
