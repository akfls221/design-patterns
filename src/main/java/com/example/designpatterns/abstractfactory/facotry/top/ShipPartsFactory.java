package com.example.designpatterns.abstractfactory.facotry.top;

import com.example.designpatterns.abstractfactory.domian.Logo;
import com.example.designpatterns.abstractfactory.domian.Name;

/**
 * 추상 Factory
 */
public interface ShipPartsFactory {

    Logo createLogo();

    Name createName();
}
