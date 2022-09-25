package com.example.designpatterns.singletome.step2.eager;

public class SingleTone {

    public static void main(String[] args) {
        EagerInitialization setting = EagerInitialization.getInstance();
        EagerInitialization setting1 = EagerInitialization.getInstance();
        System.out.println("두개의 인스턴스가 같다 :" + (setting == EagerInitialization.getInstance()) );
    }

}
