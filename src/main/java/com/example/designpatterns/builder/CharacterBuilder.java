package com.example.designpatterns.builder;

import java.time.LocalDateTime;
import java.util.List;

/**
 * CharacterBuilder(자기자신)를 return 타입으로 하면서 체인형식으로 또다른 빌더를 사용할 수 있게 만듬.
 */
public interface CharacterBuilder {

    CharacterBuilder name(String name);

    CharacterBuilder age(int age);

    CharacterBuilder birthDay(String birthDay);

    CharacterBuilder createDate(LocalDateTime createDate);

    CharacterBuilder spackList(Spack spackList);

    Character getCharacter();
}
