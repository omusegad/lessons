package com.grupio.grupio.service;

import java.util.ArrayList;
import java.util.List;

import com.grupio.grupio.model.Topic;
import com.grupio.grupio.repository.TopicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    
    public List<Topic> getTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public void addTopic(Topic topic){
       topicRepository.save(topic);
    }
   

}
