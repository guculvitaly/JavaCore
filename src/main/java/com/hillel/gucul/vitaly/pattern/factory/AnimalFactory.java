package com.hillel.gucul.vitaly.pattern.factory;

/**
 * Created by insomnia on 28.07.17.
 */
public   class  AnimalFactory {

    public static Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
