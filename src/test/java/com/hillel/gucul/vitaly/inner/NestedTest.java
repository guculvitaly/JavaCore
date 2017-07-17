package com.hillel.gucul.vitaly.inner;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.*;
import org.junit.runner.RunWith;

import java.awt.event.HierarchyBoundsAdapter;


/**
 * Created by insomnia on 09.07.17.
 */
@RunWith(HierarchicalContextRunner.class)
public class NestedTest {
    @BeforeClass
    public static void beforeAllTestMethods(){
        System.out.println("Invoked once before all test methods");
    }
    @Before
    public void beforeEachTestMethods(){
        System.out.println("Invoke before each test method");
    }
    @After
    public void afterEachTestMethod(){
        System.out.println("Invoke after each test method");
    }
    @AfterClass
    public static void afterAllTestMethods(){
        System.out.println("Invoke once after all test method");
    }
    @Test
    public void rootClassTest(){
        System.out.println("Root class test");
    }

    public class ContextA{
        @Before
        public void beforeEachTestMethods(){
            System.out.println("Invoke before each test method of context A");
        }
        @After
        public void afterEachTestMethod(){
            System.out.println("Invoke after each test method of context A");
        }
       @Test
        public void rootClassTest(){
            System.out.println("Context A test");
        }



    }

    public class ContextC{

        @Before
        public void beforeEachTestMethodOfContextC(){
            System.out.println("Invoked before each test method of context C");
        }

        @After
        public void afterEachTestMethodOfContextC(){
            System.out.println("Invoke after each test method of context C");
        }
        @Test
        public void contextATest(){
            System.out.println("Context C test");
        }
    }

}
