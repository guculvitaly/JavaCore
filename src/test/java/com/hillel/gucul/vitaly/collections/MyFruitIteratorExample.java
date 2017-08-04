package com.hillel.gucul.vitaly.collections;

import org.junit.Test;

/**
 * Created by insomnia on 04.08.17.
 */
public class MyFruitIteratorExample {

    @Test
    public void test() {

        MyOwnArrayList fruitList = new MyOwnArrayList();
        fruitList.add("Mango");
        fruitList.add("Strawaberry");
        fruitList.add("Papaya");
        fruitList.add("Watermalon");

        System.out.println("----Calling my iterator on my ArrayList-----");

        for (int i = 0; i < fruitList.size() ; i++) {
            System.out.println(fruitList.get(i));
        }

        FruitIterator it = fruitList.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println("Value: " +s);
        }

        System.out.println("--Fruit List size: " + fruitList.size());
        fruitList.remove(1);
        System.out.println("--After removal, Fruit List size: " + fruitList.size());

        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println(fruitList.get(i));
        }
    }
}
