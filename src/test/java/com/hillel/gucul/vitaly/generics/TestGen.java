package com.hillel.gucul.vitaly.generics;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by insomnia on 03.09.17.
 */
public class TestGen {

    @Test
    public void test() {
        GenericSmpl <String> genericSmpl = new GenericSmpl<>();
        genericSmpl.test("Test");

        GenericSmpl <Integer> genericSmpl11 = new GenericSmpl<>();
        genericSmpl11.test(4);
    }

    @Test
    public void test2() {

        List<Integer> list = new ArrayList<>();
        list.add(5);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog().name("Sharik"));

        List<Animal> animals = new ArrayList<>();

        Animal animal = new Animal() {

            String name;

            @Override
            Animal name (Object o){
                this.name = (String)o ;
                return this;
            }

            @Override
            Object getData() {
                return this.name;
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "name='" + name + '\'' +
                        '}';
            }
        };

        animal.name("Zhiraf");
        animals.add(animal);

        collection1(list);
        collection2(dogList);
        collection3(animals);
    }

    public void collection1(List<?> list){
        list.forEach(System.out::println);
    }

    public void collection2(List<? extends Animal> list){
        list.forEach(x -> System.out.println(x.getData()));
    }

    public void collection3(List<? super Dog> list) {
        list.forEach(x -> System.out.println(x.toString()));
    }
}

// создать класс который дженерефиц и он может работать с двумя разными типами данными
//конструктор который можнт их инилиз методы гет и сэт
//в методе мейн создать коллекцию
// которая может принимать в себя обьект этого класса с указынми
// типами данных который этот класс может принять
//после этого пререберать эту колекцию с использ java8