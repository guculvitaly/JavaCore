package com.hillel.gucul.vitaly.pattern.prototype;

/**
 * Created by insomnia on 28.07.17.
 */
public class Person implements Prototype {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    public String toString() {
        return "This person is named " + name;
    }
}
