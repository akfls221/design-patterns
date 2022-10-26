package com.example.designpatterns.builder.domain;

public class Spack {

    private int power;

    private int brain;

    private int speed;

    public Spack(int power, int brain, int speed) {
        this.power = power;
        this.brain = brain;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Spack{" +
                "power=" + power +
                ", brain=" + brain +
                ", speed=" + speed +
                '}';
    }
}
