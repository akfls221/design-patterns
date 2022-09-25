package com.example.designpatterns.singletome.step2.doublecheckedlocking;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {

    }

    public static synchronized DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
