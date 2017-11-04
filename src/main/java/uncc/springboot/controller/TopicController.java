package uncc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uncc.springboot.pojo.Topic;
import uncc.springboot.service.TopicService;

@RestController
public class TopicController {
@Autowired
private TopicService topicService;

	
@RequestMapping("/topics")
	public List<Topic> getTopics(){
		
	
	return topicService.getAllTopics();
	}
	@RequestMapping("/topic/{id}")
public Topic getTopic(@PathVariable String id) {
	
	return topicService.getTopic(Integer.parseInt(id));
}
	
	
}
