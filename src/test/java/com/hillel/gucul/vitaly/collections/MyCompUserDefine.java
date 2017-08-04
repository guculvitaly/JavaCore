package com.hillel.gucul.vitaly.collections;

import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by insomnia on 04.08.17.
 */
public class MyCompUserDefine {

    @Test
    public void test(){
        //By using name comparator (String comparison)
        TreeSet<Empl> nameComp = new TreeSet<>(new MyNameComp());
        nameComp.add(new Empl("Ram", 3000));
        nameComp.add(new Empl("John", 6000));
        nameComp.add(new Empl("Crish", 2000));
        nameComp.add(new Empl("Tom", 2400));
        for (Empl e:nameComp) {
            System.out.println(e);
        }
        nameComp.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("===================");
        //By using salary comparator (int comparison)
        TreeSet<Empl> salComp = new TreeSet<>(new MySalaryComp());
        salComp.add(new Empl("Ram", 3000));
        salComp.add(new Empl("John", 6000));
        salComp.add(new Empl("Crish", 2000));
        salComp.add(new Empl("Tom", 2400));
        for (Empl e:salComp) {
            System.out.println(e);
        }
    }
}
