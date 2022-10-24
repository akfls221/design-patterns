package com.example.designpatterns.abstractfactory.facotry;

import com.example.designpatterns.abstractfactory.domian.Ship;
import com.example.designpatterns.abstractfactory.facotry.top.DefaultShipFactory;
import com.example.designpatterns.abstractfactory.facotry.top.ShipPartsFactory;

public class WhiteShipPremiumFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipPremiumFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setLogo(shipPartsFactory.createLogo());
        ship.setName(shipPartsFactory.createName());
        return ship;
    }
}
