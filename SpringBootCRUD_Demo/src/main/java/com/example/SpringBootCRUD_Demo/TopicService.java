package com.example.SpringBootCRUD_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topic=new ArrayList<>(Arrays.asList(new Topic("1","Nilesh","Pune"),
			new Topic("2","Modi","Gujrat"),
			new Topic("3","Manmohan","Punjab"),
			new Topic("4","A Raja","Karnataka")));
	
	public List<Topic> getAllTopic()
	{
		return topic;
		
	}
	
	public Topic getTopic(String id)
	{
		return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic2) {
		
		topic.add(topic2);
	}

	public void updateaddTopic(String id, Topic topic2) {
		for(int i=0;i<topic.size();i++)
		{
			Topic t=topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, topic2);
				return;
			}
		}
		
	}

	public void DeleteTopic(String id) {
		topic.removeIf(t->t.getId().equals(id));
		
	}

	

}
