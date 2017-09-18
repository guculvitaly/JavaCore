package com.hillel.gucul.vitaly.annotations;

import java.io.Serializable;

/**
 * Created by insomnia on 23.07.17.
 */
public class People implements Serializable, Cloneable {

    private String name;

    private int age;

    public int sum;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Deprecated
    protected static void method(String[] params){}
}
