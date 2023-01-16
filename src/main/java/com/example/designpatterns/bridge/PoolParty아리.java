package com.example.designpatterns.bridge;

public class PoolParty아리 implements Champion {

    @Override
    public void skillQ() {
        System.out.println("풀파티 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("풀파티 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("풀파티 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("풀파티 아리 R");
    }
}
