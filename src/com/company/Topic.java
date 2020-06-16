package com.company;

import java.util.ArrayList;
import java.util.List;

public class Topic extends Entry {
    private String title;
    private List<Comment> comments;

    public Topic(String message, String title) {
        super(message);
        this.title = title;
        this.comments = new ArrayList<>();
    }

    public void addComment(Comment comment){
        if(getModeratedComments(comment) != null)
        comments.add(comment);
    }

    public Comment getModeratedComments(Comment comment){
        double random = Math.random() * 49 + 1;
        for(int i = 0; i < random; i++){
            comment.toggleModeration();
        }
        comment.toggleModeration();
        if(comment.isModerated()){
            return comment;
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "~title: " + title +
                ", message: " +getMessage()+
                "\n comments" + comments +"\n";
    }
}
