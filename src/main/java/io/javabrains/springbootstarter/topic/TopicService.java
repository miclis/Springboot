package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service    //Singleton
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Desc"),
			new Topic("java", "Core Java", "Core Java Desc"),
			new Topic("javascript", "JavaScript", "JavaScript Desc")
	);

	public  List<Topic> getAllTopics() {
		return topics;
	}
}
