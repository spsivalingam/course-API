package uncc.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import uncc.springboot.pojo.Topic;
@Service
public class TopicService {
	
	private List<Topic> topicList = Arrays.asList(new Topic(1,"BigData","Data Science"),new Topic(2,"Computer Networks","Networks")); 
	
	public List<Topic> getAllTopics() {
		
		return topicList;
		
	}
	
	public Topic getTopic(int id) {
		
		return topicList.stream().filter(t -> t.getId()==id).findFirst().get();
		
	}

}
