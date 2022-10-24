package com.example.designpatterns.abstractfactory.facotry;

import com.example.designpatterns.abstractfactory.domian.Logo;
import com.example.designpatterns.abstractfactory.domian.Name;
import com.example.designpatterns.abstractfactory.domian.WhiteLogoPremium;
import com.example.designpatterns.abstractfactory.domian.WhiteNamePremium;
import com.example.designpatterns.abstractfactory.facotry.top.ShipPartsFactory;

public class WhiteShipPartPremiumFactory implements ShipPartsFactory {
    @Override
    public Logo createLogo() {
        return new WhiteLogoPremium();
    }

    @Override
    public Name createName() {
        return new WhiteNamePremium();
    }
}
