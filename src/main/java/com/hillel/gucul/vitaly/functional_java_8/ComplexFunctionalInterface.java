package com.hillel.gucul.vitaly.functional_java_8;

/**
 * Created by insomnia on 18.08.17.
 */
public interface ComplexFunctionalInterface extends SimpleFuncInterface {

    static void doSomeWork() {
        System.out.println("Doing some work in interface impl...");
    }

    default void doSomeOtherWork() {
        System.out.println("Doing some other work in interface impl...");
    }

    //static void doNewWork() {}
}
