package io.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicSrvice {
	
	private List<Topic> list=new ArrayList <>(Arrays.asList(
			new Topic("spring","Spring Framework","desc"),
			new Topic("fgg","Spring Framework","desc"),
			new Topic("gbdfg","Spring Framework","desc")
			
			
			)); 
	
	@Autowired
	TopicRepository topicrepo;
	
	public List<Topic> getAllTopics(){
		List<Topic> list= new ArrayList<>();
		topicrepo.findAll()
		.forEach(list::add);
		return list;
		
	}
	
	public Topic getTopic(String id) {
		return topicrepo.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		topicrepo.save(topic);
	}

	public void UpdateTopic(Topic topic, String id) {
		
		topicrepo.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicrepo.deleteById(id);
		
	}
}
