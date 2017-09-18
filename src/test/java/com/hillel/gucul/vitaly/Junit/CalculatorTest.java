package com.hillel.gucul.vitaly.Junit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by insomnia on 14.07.17.
 */
public class CalculatorTest {

    @Test
    public void testFindMax(){
       assertEquals(4, Calculator.findMax(new int[]{1,3,4,2}));
       assertEquals(-1, Calculator.findMax(new int[]{-12,-1,-3,-4}) );
    }

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero(){
        Calculator calculator = new Calculator();// My class is tested

        //assert statements
        assertEquals("10 x 0 must be 1", 0, calculator.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, calculator.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, calculator.multiply(0, 0));

    }
}
