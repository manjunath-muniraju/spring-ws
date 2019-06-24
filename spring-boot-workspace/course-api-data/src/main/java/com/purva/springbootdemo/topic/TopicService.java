package com.purva.springbootdemo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework", "Spring Desc"),
			new Topic("java","core java", "java Desc"),
			new Topic("javascript","JavaScript", "javascript Desc")
			));
	
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		//topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		//topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		//topicRepository.delete(id);
	}
}
