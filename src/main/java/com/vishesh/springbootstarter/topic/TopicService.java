package com.vishesh.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(new Topic("spring", "spring framework", "spring framework description"),
			new Topic("java", "java core", "core java description"),
			new Topic("javascript", "javascript es6", "javascript description"));

	public List<Topic> getAllTopics() {
		return topics;
	}
}
