package com.hillel.gucul.vitaly.generics;

/**
 * Created by insomnia on 03.09.17.
 */
public class GenericsType <Type> {

    private Type t;

    public GenericsType () {

    }

    public GenericsType(Type t) {
        this.t = t;
    }

    public Type getType() {
        return t;
    }

    public void setType(Type t) {
        this.t = t;
    }
}
