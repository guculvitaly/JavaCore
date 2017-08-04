package com.hillel.gucul.vitaly.pattern;


import com.hillel.gucul.vitaly.pattern.abstractfactory.AbstractFactory;
import com.hillel.gucul.vitaly.pattern.abstractfactory.SpeciesFactory;
import com.hillel.gucul.vitaly.pattern.builder.Student;
import com.hillel.gucul.vitaly.pattern.factory.Animal;
import com.hillel.gucul.vitaly.pattern.factory.AnimalFactory;
import com.hillel.gucul.vitaly.pattern.prototype.Dog;
import com.hillel.gucul.vitaly.pattern.prototype.Person;
import com.hillel.gucul.vitaly.pattern.singleton.SingletonExample;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by insomnia on 28.07.17.
 */
public class TestPatterns {

    /* Classic way to create an object
    Student s = new Student();
    s.setName("");
    s.setAge(18);
    s.setLanguage(Arrays,asList("chinese", "english"));
     */

    @Test
    public void builder() {
        Student s = new Student.Builder().name("vetal").age(25).language(Arrays.asList("chinese", "english")).name("vetal").build();
        System.out.println(s);
    }

    @Test
    public void factory() {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = AnimalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = AnimalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());

    }

    @Test
    public void  abstractFactory() {

        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");

        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = speciesFactory1.getAnimal("snake");
        System.out.println("a2 sound: " + a2.makeSound());

        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");

        Animal a3 = speciesFactory1.getAnimal("dog");
        System.out.println("a3 sound: " + a3.makeSound());


        Animal a4 = speciesFactory1.getAnimal("cat");
        System.out.println("a4 sound: " + a4.makeSound());

    }

    @Test
    public void prototype() {
        Person person1 = new Person("Fred");
        System.out.println("person1: " + person1);

        Person person2 = (Person) person1.doClone();
        System.out.println("person2 :" + person2);

        Dog dog1 = new Dog("Wooof!");
        System.out.println("dog 1:" + dog1);
        Dog dog2 = (Dog) dog1.doClone();
        System.out.println("dog 2:" + dog2);

    }

    @Test
    public void singleton() {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.sayHello();
    }

}
