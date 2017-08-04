package com.hillel.gucul.vitaly.pattern.abstractfactory;

/**
 * Created by insomnia on 28.07.17.
 */
public class AbstractFactory {

    public SpeciesFactory getSpeciesFactory(String type) {
        if ("mammal".equals(type)) {
            return new MammalFactory();
        } else {
            return new ReptileFactory();
        }
    }
}
