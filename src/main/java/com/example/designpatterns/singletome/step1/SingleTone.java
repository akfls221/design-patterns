package com.example.designpatterns.singletome.step1;

public class SingleTone {

    public static void main(String[] args) {
        Setting setting = Setting.getInstance();
        Setting setting1 = Setting.getInstance();
        System.out.println("두개의 인스턴스가 같다 :" + (setting == Setting.getInstance()) );
    }

}
