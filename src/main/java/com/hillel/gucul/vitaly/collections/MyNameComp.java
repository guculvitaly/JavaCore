package com.hillel.gucul.vitaly.collections;

import java.util.Comparator;

/**
 * Created by insomnia on 04.08.17.
 */
public class MyNameComp implements Comparator <Empl> {

    @Override
    public int compare(Empl e1, Empl e2){
        return e1.getName().compareTo(e2.getName());
    }
}
