package com.hillel.gucul.vitaly.multithreading;

/**
 * Created by insomnia on 23.09.17.
 */
public class TestThreadSecond {

    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}
