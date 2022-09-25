package com.example.designpatterns.singletome.step2;

public class SettingWithSynchronized {

    private static SettingWithSynchronized instance;

    private SettingWithSynchronized() {

    }

    public static synchronized SettingWithSynchronized getInstance() {
        if (instance == null) {
            instance = new SettingWithSynchronized();
        }
        return instance;
    }
}
