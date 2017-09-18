package com.hillel.gucul.vitaly.pattern.abstractfactory;

import com.hillel.gucul.vitaly.pattern.factory.Animal;
import com.hillel.gucul.vitaly.pattern.factory.Cat;
import com.hillel.gucul.vitaly.pattern.factory.Dog;

/**
 * Created by insomnia on 28.07.17.
 */
public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
