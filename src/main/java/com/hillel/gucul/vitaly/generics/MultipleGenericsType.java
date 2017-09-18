package com.hillel.gucul.vitaly.generics;

/**
 * Created by insomnia on 03.09.17.
 */
public class MultipleGenericsType <T, X> {

    private T t;
    private X x;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public MultipleGenericsType(T t, X x) {
        this.t = t;
        this.x = x;

    }
}
