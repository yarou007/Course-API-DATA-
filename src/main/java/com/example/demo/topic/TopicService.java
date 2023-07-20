package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	
	public List<Topic> GetAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll() /// fetching all topics a travers findAll()
		.forEach(topics::add);  /// Kol ligne besh talkah besh tzidou lil topics ::add --> lambda expression (child method)
		return topics;
	}
	
	public Topic getTopic(String id) {
	//	return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		/// if the rows exist gets update else taamel insertion :) 
	}

	public void deleteTopic(String id) {
          topicRepository.deleteById(id);
	}
}
