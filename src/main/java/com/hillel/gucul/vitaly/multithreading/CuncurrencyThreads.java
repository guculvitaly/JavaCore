package com.hillel.gucul.vitaly.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by insomnia on 23.09.17.
 */
public class CuncurrencyThreads {
    public static void main(String[] args) {

//        Runnable task = () -> {
//            Thread.currentThread().setName("Vasya");
//            String threadName =Thread.currentThread().getName();
//            System.out.println("Hello " + threadName);
//        };
//
//        task.run();
//
//        Thread thread = new Thread(task);
//        thread.start();
//
//        System.out.println("Done!");

        System.out.println("==============");

        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
