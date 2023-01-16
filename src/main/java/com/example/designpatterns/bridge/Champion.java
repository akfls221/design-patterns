package com.example.designpatterns.bridge;

public interface Champion {

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

    default void moveRight() {

    }
}
