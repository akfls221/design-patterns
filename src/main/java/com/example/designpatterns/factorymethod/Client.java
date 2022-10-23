package com.example.designpatterns.factorymethod;

public class Client {

    public static void main(String[] args) {

        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "akfls221@gmail.com");
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "akfls221@gmail.com");
        System.out.println("blackShip = " + blackShip);



    }
}
