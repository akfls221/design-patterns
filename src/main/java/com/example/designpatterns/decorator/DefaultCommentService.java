package com.example.designpatterns.decorator;

public class DefaultCommentService implements CommentService{

    @Override
    public void addComment(String Comment) {
        System.out.println("Comment = " + Comment);
    }
}
