package com.example.designpatterns.abstractfactory.facotry;

import com.example.designpatterns.abstractfactory.domian.Logo;
import com.example.designpatterns.abstractfactory.domian.Name;
import com.example.designpatterns.abstractfactory.domian.WhiteLogo;
import com.example.designpatterns.abstractfactory.domian.WhiteName;
import com.example.designpatterns.abstractfactory.facotry.top.ShipPartsFactory;

public class WhiteShipPartsFactory implements ShipPartsFactory {

    @Override
    public Logo createLogo() {
        return new WhiteLogo();
    }

    @Override
    public Name createName() {
        return new WhiteName();
    }
}
