package com.example.designpatterns.prototypepattern;

import java.util.Objects;

/**
 * Clone을 지원해주고 싶은 인스턴스에 Cloneable 을 구현해주어야 함.
 */
public class GithubIssue implements Cloneable {
    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return new StringBuilder()
                .append("www.github.com")
                .append("/" + id)
                .append("/" + title)
                .toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
