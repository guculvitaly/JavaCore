package com.hillel.gucul.vitaly.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by insomnia on 03.09.17.
 */
public class TaskGenericClass <T, X> {

    private T t;
    private X x;
    String name;

    public TaskGenericClass(T t, X x) {
        this.t = t;
        this.x = x;
    }

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

    @Override
    public String toString() {
        return "TaskGenericClass{" +
                "t=" + t +
                ", x=" + x +
                ", name='" + name + '\'' +
                '}';
    }





}
