package com.hillel.gucul.vitaly.generics;

/**
 * Created by insomnia on 03.09.17.
 */
public class Dog extends Animal {

    private String dogName;

    @Override
    public Object getData(){
        return dogName;
    }

    @Override
    public Dog name(Object o){
        this.dogName = (String)o;
        return this;
    }

    public void test2(){

    }
}
