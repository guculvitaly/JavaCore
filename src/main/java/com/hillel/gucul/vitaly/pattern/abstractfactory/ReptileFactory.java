package com.hillel.gucul.vitaly.pattern.abstractfactory;

import com.hillel.gucul.vitaly.pattern.factory.Animal;
import com.hillel.gucul.vitaly.pattern.factory.Snake;
import com.hillel.gucul.vitaly.pattern.factory.Tyrannosaurus;

/**
 * Created by insomnia on 28.07.17.
 */
public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if ("snake".equals(type)) {
            return new Snake();
        } else {
            return new Tyrannosaurus();
        }
    }
}
