package com.hillel.gucul.vitaly.generics;

import java.util.Collection;

/**
 * Created by insomnia on 03.09.17.
 */
public class GenericSmpl <T> {

    void test(T t){
        System.out.println(t.toString());
    }

    public static <T> T addAndReturn(T element, Collection<T> collection) {
        collection.add(element);
        return element;
    }
}
