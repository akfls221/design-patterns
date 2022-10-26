package com.example.designpatterns.builder;

import java.time.LocalDateTime;
import java.util.List;

public class Character {

    private String name;

    private int age;

    private String birthDay;

    private LocalDateTime createDate;

    private List<Spack> spackList;

    public Character(String name, int age, String birthDay, LocalDateTime createDate, List<Spack> spackList) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
        this.createDate = createDate;
        this.spackList = spackList;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDay='" + birthDay + '\'' +
                ", createDate=" + createDate +
                ", spackList=" + spackList +
                '}';
    }
}
