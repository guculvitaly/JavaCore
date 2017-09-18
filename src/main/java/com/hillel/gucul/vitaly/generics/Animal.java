package com.hillel.gucul.vitaly.generics;

/**
 * Created by insomnia on 03.09.17.
 */
public abstract class Animal <T> {

    abstract T name(T t);

    abstract T getData();

    public void text(){
        System.out.println("This is Animal!");
    }
}
