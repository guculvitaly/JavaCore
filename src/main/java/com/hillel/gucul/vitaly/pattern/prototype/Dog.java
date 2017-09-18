package com.hillel.gucul.vitaly.pattern.prototype;

/**
 * Created by insomnia on 28.07.17.
 */
public class Dog implements Prototype {

    String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }

    public String toString() {
        return "This dog says " + sound;
    }
}
