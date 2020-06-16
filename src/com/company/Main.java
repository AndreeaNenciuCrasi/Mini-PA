package com.company;

public class Main {

    public static void main(String[] args) {
        Forum forum = Forum.getInstance();
        Topic topic1 = new Topic("war news","war news");
        Topic topic2 = new Topic("social news","social news");
        Topic topic3 = new Topic("politics news","politics news");
        Topic topic4 = new Topic("VIP news","VIP news");

        Comment comment1 = new Comment("positive");
        Comment comment2 = new Comment("disagreement");
        Comment comment3 = new Comment("encouraged");
        Comment comment4 = new Comment("criticized");
        Comment comment5 = new Comment("applauded");

        topic1.addComment(comment1);
        topic1.addComment(comment2);
        topic1.addComment(comment3);
        topic1.addComment(comment4);
        topic1.addComment(comment5);

        topic2.addComment(comment1);
        topic2.addComment(comment2);
        topic2.addComment(comment3);
        topic2.addComment(comment4);
        topic2.addComment(comment5);

        topic3.addComment(comment1);
        topic3.addComment(comment2);
        topic3.addComment(comment3);
        topic3.addComment(comment4);
        topic3.addComment(comment5);

        topic4.addComment(comment1);
        topic4.addComment(comment2);
        topic4.addComment(comment3);
        topic4.addComment(comment4);
        topic4.addComment(comment5);

        forum.addTopics(topic1);
        forum.addTopics(topic2);
        forum.addTopics(topic3);
        forum.addTopics(topic4);

        System.out.println(forum);
    }
}
