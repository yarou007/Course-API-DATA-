package com.example.demo.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

	@Autowired
	private LessonRepository lessonRepository;

	
	public List<Lesson> GetAllLessons(String courseId){
		//return topics;
		List<Lesson> lesson = new ArrayList<>();
		lessonRepository.findByCourseId(courseId) /// fetching all courses a travers findAll() // findbyCourseID
		.forEach(lesson::add);  /// Kol ligne besh talkah besh tzidou lil topics ::add --> lambda expression (child method)
		return lesson;
	}
	
	public Lesson getLesson(String id) {
	//	return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return lessonRepository.findById(id).get();
	}

	public void addLesson(Lesson lesson) {
		lessonRepository.save(lesson);
		
	}

	public void updateLesson(String id, Lesson lesson) {
		lessonRepository.save(lesson);
		/// if the rows exist gets update else taamel insertion :) 
	}

	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
	}
}
