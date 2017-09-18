package com.hillel.gucul.vitaly.functional_java_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by insomnia on 18.08.17.
 */
public class TestLambdaSorting {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        //lambda here!
        listDevs.sort((o1,o2)-> o1.getAge() - o2.getAge());

        //java 8 only, lambda also, to print the list
        listDevs.forEach(developer -> System.out.println(developer));

    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<>();

        result.add(new Developer("alex", 10000, 33));
        result.add(new Developer("alvin", 80000, 23));
        result.add(new Developer("jason", 100000, 10));
        result.add(new Developer("iris", 1700000, 55));

        return result;
    }
}
