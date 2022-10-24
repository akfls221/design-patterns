package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.abstractfactory.domian.Ship;
import com.example.designpatterns.abstractfactory.facotry.WhiteShipFactory;
import com.example.designpatterns.abstractfactory.facotry.WhiteShipPartPremiumFactory;
import com.example.designpatterns.abstractfactory.facotry.WhiteShipPartsFactory;
import com.example.designpatterns.abstractfactory.facotry.WhiteShipPremiumFactory;

public class Consumer {

    public static void main(String[] args) {

        WhiteShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = whiteShipFactory.createShip();
        System.out.println("ship.getLogo().getClass() = " + ship.getLogo().getClass());
        System.out.println(" ship.getName().getClass() = " + ship.getName().getClass());

        WhiteShipPremiumFactory whiteShipFactory2 = new WhiteShipPremiumFactory(new WhiteShipPartPremiumFactory());
        Ship ship2 = whiteShipFactory2.createShip();
        System.out.println("ship.getLogo().getClass() = " + ship2.getLogo().getClass());
        System.out.println(" ship.getName().getClass() = " + ship2.getName().getClass());
    }
}
