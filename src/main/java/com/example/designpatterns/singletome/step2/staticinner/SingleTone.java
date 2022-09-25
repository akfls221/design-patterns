package com.example.designpatterns.singletome.step2.staticinner;

public class SingleTone {

    public static void main(String[] args) {
        StaticInner setting = StaticInner.getInstance();
        StaticInner setting1 = StaticInner.getInstance();
        System.out.println("두개의 인스턴스가 같다 :" + (setting == setting1));
    }

}
