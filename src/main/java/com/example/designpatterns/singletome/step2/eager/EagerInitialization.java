package com.example.designpatterns.singletome.step2.eager;

public class EagerInitialization {

    //이른 초기화
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
