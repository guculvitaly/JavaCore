package com.hillel.gucul.vitaly.functional_java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by insomnia on 18.08.17.
 */
public class TestRegularSorting {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return  o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

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
