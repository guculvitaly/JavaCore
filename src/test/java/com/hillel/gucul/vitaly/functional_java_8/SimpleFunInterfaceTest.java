package com.hillel.gucul.vitaly.functional_java_8;

import com.hillel.gucul.vitaly.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;

/**
 * Created by insomnia on 18.08.17.
 */
public class SimpleFunInterfaceTest {
    @org.junit.Test
    public void test() {

        checkWork(new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in SimpleFun impl...");
            }
        });

        //or we can do this with labda
        checkWork(() -> System.out.println("Do work in lambda exp impl...."));
    }


    public static void checkWork(SimpleFuncInterface simpleFuncInterface){
        simpleFuncInterface.doWork();
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){

        for (Integer n: list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    @org.junit.Test
    public void predicateTest() {

        Predicate<Integer> isPositive = x -> x >0;

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Print all numbers: ");

        //pass n as parametr
        eval(list, n -> true);

        System.out.println("Print even numbers:");
        eval(list, n -> n%2 == 0);

        System.out.println("Print numbers greater than 3:");
        eval(list, n -> n > 3);


    }

    @org.junit.Test
    public void binaryOperator() {

        BinaryOperator<Integer> multiply = (x, y) -> x/y;

        System.out.println(multiply.apply(3,5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20
    }

    @org.junit.Test
    public void unaryOperator() {
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5)); // 25
    }

    @org.junit.Test
    public void function() {
        Function<Integer, String> convert = x -> String.valueOf(x) + "euro ";
        System.out.println(convert.apply(5));
    }

    @org.junit.Test
    public void consumer() {
        Consumer<Integer> printer = x-> {
            Integer integer = new Integer(x + 5);
            System.out.printf("%d euro \n", x);
        };
        printer.accept(600);
    }


    @org.junit.Test
    public void java8ForEachMap() {

        Map<String, Integer> items = new HashMap<>();
        items.put("A",  10);
        items.put("B",  20);
        items.put("C",  30);
        items.put("D",  40);
        items.put("E",  50);
        items.put("F",  60);

        //regular
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        System.out.println("---------------------------");

        //java 8
        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        //if we have more moves
        items.forEach((k, v) -> {
            System.out.println("Item : " + k + "Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });

    }


    @org.junit.Test
    public void java8ForEachAndList() {

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //regular
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("-----------------------");

        //lambda
        //Output : A,B,C,D,E
        items.forEach(item -> System.out.println(item));

        System.out.println("------------------------");

        //method reference
        //Output : A,B,C,D,E
        items.forEach(System.out::println);

        System.out.println("-------------------------");

        //Stream and filter
        //Output : B
        items.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);



    }


    @org.junit.Test
    public void dogTest() {

        Supplier<List <Dog>> dogs = () -> {

         List<Dog >  dogName = new ArrayList<>();

         dogName.add(new Dog("Spike", 15));
         dogName.add(new Dog("Spike", 15));
         dogName.add(new Dog("Spike", 15));

            for (Dog dogList :dogName) {
                System.out.println(dogName);
            }
            return null;

        };




    }


}
