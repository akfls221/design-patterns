package com.example.designpatterns.builder;

import java.time.LocalDateTime;

/**
 * CharacterBuilder 를 주입받아 내부에서 빌더패턴을 통해 만들어진 객체를 return하는 방식(빌더를 자주써서 만들어야하면 이렇게 만들어두면 좋을듯)
 */
public class CharacterDirector {

    private CharacterBuilder characterBuilder;

    public CharacterDirector(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public Character createTaeKwanCharacter() {
        Spack spack = new Spack(100, 100, 100);
        Spack spack2 = new Spack(50, 50, 50);

        return characterBuilder
                .name("엄태권")
                .age(29)
                .birthDay("2021-10-27")
                .createDate(LocalDateTime.now())
                .spackList(spack)
                .spackList(spack2)
                .getCharacter();
    }
}
