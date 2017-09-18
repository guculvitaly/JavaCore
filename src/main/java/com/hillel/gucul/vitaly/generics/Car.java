package com.hillel.gucul.vitaly.generics;

/**
 * Created by insomnia on 03.09.17.
 */
public class Car <T extends Car> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Car(T t) {
        this.t = t;
    }

    public Car() {

    }
}
