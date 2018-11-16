package com.abir.courseapi.course;

import com.abir.courseapi.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Course {
    private String id;
    private String name;
    private String description;
    private Topic topic;


    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course(){

    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}

