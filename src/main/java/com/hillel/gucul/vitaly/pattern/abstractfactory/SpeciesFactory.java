package com.hillel.gucul.vitaly.pattern.abstractfactory;

import com.hillel.gucul.vitaly.pattern.factory.Animal;

/**
 * Created by insomnia on 28.07.17.
 */
public  abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}
