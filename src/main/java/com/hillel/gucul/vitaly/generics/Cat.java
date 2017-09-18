package com.hillel.gucul.vitaly.generics;

/**
 * Created by insomnia on 03.09.17.
 */
public class Cat extends Animal {

    @Override
    Cat name(Object o){
        return this;
    }

    @Override
    Object getData(){
        return null;
    }
}
