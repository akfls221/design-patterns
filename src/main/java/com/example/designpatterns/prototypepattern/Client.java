package com.example.designpatterns.prototypepattern;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setName("Design Pattern");
        githubRepository.setUser("taeKwan");

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println("clone = " + clone.getUrl());

        System.out.println(clone == githubIssue);
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.equals(githubIssue));
    }
}
