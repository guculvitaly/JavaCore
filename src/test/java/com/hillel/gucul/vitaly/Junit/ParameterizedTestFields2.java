package com.hillel.gucul.vitaly.Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by insomnia on 14.07.17.
 */
@RunWith(Parameterized.class)
public class ParameterizedTestFields2 {

    private int m1;
    private int m2;

    public ParameterizedTestFields2(int p1,int p2) {
        m1 = p1;
        m2 = p2;
    }

    //creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1,2}, {5,3}, {121,4}};
        return Arrays.asList(data);
    }

    @Test
    public void testMultiplyException() {
        Calculator tester = new Calculator();
        assertEquals("Result", m1*m2, tester.multiply(m1,m2));
    }
}
