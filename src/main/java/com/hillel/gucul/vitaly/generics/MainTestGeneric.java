package com.hillel.gucul.vitaly.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by insomnia on 03.09.17.
 */
public class MainTestGeneric {

    public static void main(String[] args) {

        List<TaskGenericClass<String, Integer>> mainlist = new ArrayList();
        mainlist.add(new TaskGenericClass("frodo", 25));
        mainlist.add(new TaskGenericClass("Sam", 25));
        mainlist.add(new TaskGenericClass("Gollum", 25));

        //TaskGenericClass<String , Integer> genericTest = new TaskGenericClass(25,"FrodoBeggins");




        mainlist.forEach(x -> System.out.println("Our list is :" + mainlist));
        //System.out.println(genericTest);







    }
}
