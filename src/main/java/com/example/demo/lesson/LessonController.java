package com.example.demo.lesson;

import java.util.Arrays;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.Course;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping("/topics/{topicId}/courses/{id}/lessons")
	public List<Lesson> GetAllLessons(@PathVariable String id){
		return lessonService.GetAllLessons(id) ;
 	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public Lesson GetLesson(@PathVariable String id) {
		return lessonService.getLesson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses/{id}/lessons")
	public void addLesson(@RequestBody Lesson lesson,@PathVariable String topicId,@PathVariable String id ) {
		lesson.setCourse(new Course(id,"","",topicId));
		lessonService.addLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void updateLesson(@RequestBody Lesson lesson,@PathVariable String topicId,@PathVariable String courseId,@PathVariable String id) {
		lesson.setCourse(new Course(courseId,"","",topicId));
		lessonService.updateLesson(id,lesson);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void deleteLesson(@PathVariable String id) {
		lessonService.deleteLesson(id);
	}


}
