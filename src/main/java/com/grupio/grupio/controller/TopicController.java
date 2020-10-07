package com.grupio.grupio.controller;

import java.util.List;

import com.grupio.grupio.model.Topic;
import com.grupio.grupio.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    TopicService topicservice ;

    @GetMapping("/topics")
    public List<Topic> index(){
      return topicservice.getTopics();
    }
    // add topic
    @PostMapping("/topic")
    public void addTopic(@RequestBody Topic topic){
        topicservice.addTopic(topic);
    }
  

}
