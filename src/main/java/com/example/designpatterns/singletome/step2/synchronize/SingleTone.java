package com.example.designpatterns.singletome.step2.synchronize;

public class SingleTone {

    public static void main(String[] args) {
        SettingWithSynchronized setting = SettingWithSynchronized.getInstance();
        SettingWithSynchronized setting1 = SettingWithSynchronized.getInstance();
        System.out.println("두개의 인스턴스가 같다 :" + (setting == SettingWithSynchronized.getInstance()) );
    }

}
