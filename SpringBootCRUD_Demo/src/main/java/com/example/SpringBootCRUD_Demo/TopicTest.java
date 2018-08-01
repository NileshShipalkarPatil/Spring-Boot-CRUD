package com.example.SpringBootCRUD_Demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicTest {
	
	
	@Autowired
	TopicService topicservice;
	
	@RequestMapping("/Topic")
	public List<Topic> getAllTopic()
	{
		return topicservice.getAllTopic();
		
	}
	
	@RequestMapping("/Topic/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/Topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.addTopic(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/Topics/{id}")
	public void updateaddTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topicservice.updateaddTopic(id,topic);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Topics/{id}")
	public void DeleteTopic(@PathVariable String id)
	{
		topicservice.DeleteTopic(id);
	}

}
