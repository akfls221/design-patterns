package com.example.designpatterns.singletome.step2.doublecheckedlocking;

public class SingleTone {

    public static void main(String[] args) {
        DoubleCheckedLocking setting = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking setting1 = DoubleCheckedLocking.getInstance();
        System.out.println("두개의 인스턴스가 같다 :" + (setting == DoubleCheckedLocking.getInstance()) );
    }

}
