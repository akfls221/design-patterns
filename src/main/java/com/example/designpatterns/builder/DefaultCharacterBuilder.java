package com.example.designpatterns.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DefaultCharacterBuilder implements CharacterBuilder{

    private String name;

    private int age;

    private String birthDay;

    private LocalDateTime createDate;

    private List<Spack> spackList;

    @Override
    public CharacterBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CharacterBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public CharacterBuilder birthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    @Override
    public CharacterBuilder createDate(LocalDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    @Override
    public CharacterBuilder spackList(Spack spackList) {
        if (this.spackList == null) {
            this.spackList = new ArrayList<>();
        }
        this.spackList.add(spackList);

        return this;
    }

    @Override
    public Character getCharacter() {
        return new Character(name, age, birthDay, createDate, spackList);
    }
}
