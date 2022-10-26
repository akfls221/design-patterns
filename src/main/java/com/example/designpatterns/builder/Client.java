package com.example.designpatterns.builder;

import com.example.designpatterns.builder.builderFactory.CharacterBuilder;
import com.example.designpatterns.builder.builderFactory.CharacterDirector;
import com.example.designpatterns.builder.builderFactory.DefaultCharacterBuilder;
import com.example.designpatterns.builder.domain.Character;
import com.example.designpatterns.builder.domain.Spack;

import java.time.LocalDateTime;

public class Client {

    public static void main(String[] args) {
        CharacterBuilder builder = new DefaultCharacterBuilder();

        Spack spack = new Spack(100, 100, 100);
        Spack spack2 = new Spack(50, 50, 50);


        Character character = builder
                .name("엄태권")
                .age(29)
                .birthDay("2021-10-27")
                .createDate(LocalDateTime.now())
                .spackList(spack)
                .spackList(spack2)
                .getCharacter();

        System.out.println("character = " + character);

        /**
         * 빌더를 만들어둔 Director 사용방법
         */
        CharacterDirector characterDirector = new CharacterDirector(new DefaultCharacterBuilder());
        Character taeKwanCharacter = characterDirector.createTaeKwanCharacter();

        System.out.println("taeKwanCharacter = " + taeKwanCharacter);
    }
}
