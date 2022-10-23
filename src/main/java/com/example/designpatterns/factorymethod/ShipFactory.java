package com.example.designpatterns.factorymethod;

import org.springframework.util.Assert;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println("email = " + email + "다 만들었습니다. " + ship.getName());
    }

    Ship createShip();

    private void prepareFor(String name) {
        System.out.println(name + "만들 준비 중");
    }


}
