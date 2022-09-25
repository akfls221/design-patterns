package com.example.designpatterns.singletome.step2.staticinner;

public class StaticInner {

    private StaticInner() {

    }

    private static class SettingsHolder{
        private static final StaticInner INSTANCE = new StaticInner();
    }

    public static StaticInner getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
