package com.hillel.gucul.vitaly.collections;

import java.util.Comparator;

/**
 * Created by insomnia on 04.08.17.
 */
public class MySalaryComp implements Comparator <Empl> {

    @Override
    public int compare(Empl o1, Empl o2){
        if (o1.getSalary() > o2.getSalary()){
            return 1;
        }else {
            return -1;
        }
    }
}
