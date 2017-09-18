package com.hillel.gucul.vitaly.generics;

import java.util.ArrayList;

/**
 * Created by insomnia on 03.09.17.
 */
public class GenericsExample {

    public static void main(String[] args) {

        GenericsType<Integer> genericsType1 = new GenericsType<>(Integer.valueOf("5638"));

        System.out.println(genericsType1.getType());

        genericsType1.setType(7834);
        System.out.println(genericsType1.getType());

        System.out.println("============================");

        MultipleGenericsType<Integer, String> multipleGenericsType =
                new MultipleGenericsType<>(34567, "Your Salary is:");

        System.out.println(multipleGenericsType.getX() + " " + multipleGenericsType.getT());

        System.out.println("===========================");

        GenericsType<String> genericsType = new GenericsType<>("Apple");

        System.out.println(genericsType.getType());

        System.out.println("<=============================>");


        MultipleGenericsType<Integer, GenericsType<String>> multipleGenericsType1
                = new MultipleGenericsType<>(123444, genericsType);

        multipleGenericsType1.setT(15);
        multipleGenericsType1.setX(genericsType);

        System.out.println(multipleGenericsType1.getT() + " USD is a price of "
                + multipleGenericsType1.getX().getType());
        System.out.println("===================================");


        BMW bmw = new BMW();
        Audi audi = new Audi();

        bmw.setModel("X5");

        Car<Audi> car = new Car<>(audi);

        car.setT(audi);
        audi.setModel("TT");

        System.out.println(" Model is: " + car.getT().getModel());


        Car<BMW> car1 = new Car<>(bmw);
        bmw.setModel("X3");
        System.out.println(" Model is: " + car1.getT().getModel());

        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(bmw);
        arrayList.add(audi);



    }
}
