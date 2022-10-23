package com.example.designpatterns.singletome.step3;

import com.example.designpatterns.singletome.step2.synchronize.SettingWithSynchronized;

public class SingleTone {

    public static void main(String[] args) {
        EnumSetting instance = EnumSetting.INSTANCE;
        EnumSetting instance2 = EnumSetting.INSTANCE;
        System.out.println("두개의 인스턴스가 같다 :" + (instance == instance2) );
    }

}
