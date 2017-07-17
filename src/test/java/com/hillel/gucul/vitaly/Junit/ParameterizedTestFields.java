package com.hillel.gucul.vitaly.Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;


/**
 * Created by insomnia on 14.07.17.
 */
//@RunWith(Parameterized)

    @RunWith(Parameterized.class)
    public class ParameterizedTestFields {

        //fields used together with @Parametr must be public
        @Parameterized.Parameter(0)
        public int m1;
        @Parameterized.Parameter(1)
        public int m2;
        @Parameterized.Parameter(2)
        public int result;

        // creates the test data

        @Parameterized.Parameters
        public  static Collection<Object[]> data() {
            Object[][] data = new Object[][] {{4, 2,8},{5,3,15},{121,4,484}};
            return Arrays.asList(data);
        }


        @Test
        public void testMultiPlyException() {
            Calculator calculator = new Calculator();
            assertEquals("Result",result,calculator.multiply(m1,m2));
        }
    }

