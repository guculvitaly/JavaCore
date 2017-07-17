package com.hillel.gucul.vitaly.Junit;

import org.junit.jupiter.api.*;

import java.util.function.Supplier;

/**
 * Created by insomnia on 14.07.17.
 */
public class AppTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");
    }

    @Tag("DEV")
    @Test
    void testCalcOne() {
        System.out.println("=====TEST ONE EXECUTED====");
        Assertions.assertEquals(4, Calculator.sum(2,2));
    }

    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo(){
        System.out.println("=====TEST TWO EXECUTED====");
        Assertions.assertEquals(6, Calculator.sum(2,4));

    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");

    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }

    @Tag("DEV")
    @Test
    void testCase(){
        //Test will pass
        Assertions.assertNotEquals(3,Calculator.sum(2,2));

        //Test will fail
        Assertions.assertNotEquals(5,Calculator.sum(2,2));

        //Test will fail
        Supplier<String> messageSuplier = () -> "CalculatorTest.sum(2,2) test failed";
        Assertions.assertNotEquals(5,Calculator.sum(2,2), messageSuplier);
    }
}
