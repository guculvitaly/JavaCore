package com.hillel.gucul.vitaly.helloworld.inner;

import org.junit.*;

/**
 * Created by insomnia on 09.07.17.
 */
public class TraditionalTest {

    @BeforeClass
    public static void beforeAllTestMethods(){
        System.out.println("Before Class");
    }
    
    @Before
    public void beforeEachTestMethod(){
        System.out.println("Before");
    }

    @After
    public void afterEachTestMethod(){
        System.out.println("After");
    }

    @AfterClass
    public static void afterAllTestMethods(){
        System.out.println("After Class");
    }

    @Test
    public void testOne(){
        System.out.println("Test One");
    }

    @Test
    public void testTwo(){
        System.out.println("Test Two");
    }

}
