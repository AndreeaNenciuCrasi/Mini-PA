package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private static Forum instance = null;
    private List<Topic> topics;

    public Forum() {
        this.topics = new ArrayList<>();
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public static Forum getInstance(){
        if(instance==null){
            instance = new Forum();
        }
        return instance;
    }

    public void addTopics(Topic topic){
        topics.add(topic);
    }

    @Override
    public String toString() {
        return "Forum:\n" +
                "~~Topics:\n" + topics;
    }

}
