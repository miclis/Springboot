package io.javabrains.courseapidata.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service    //Singleton
public class TopicService {
	// Arrays.asList creates immutable object
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Desc"),
			new Topic("java", "Core Java", "Core Java Desc"),
			new Topic("javascript", "JavaScript", "JavaScript Desc")
	));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}
}
