package com.hillel.gucul.vitaly.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by vyacheslav on 14.07.17.
 */
public class CalculatorTest2 {

    @BeforeClass
    public static void setUpBeforeClass()throws Exception{
        System.out.println("before class");
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.png"));
//        bufferedReader.read();
    }

    @Before
    public void setUp()throws Exception{
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,Calculator.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));

    }

    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27,Calculator.cube(3));
    }
    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        assertEquals("ym eman si nahk ",Calculator.reverseWord("my name is khan "));
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("after");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }


}