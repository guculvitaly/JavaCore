package com.hillel.gucul.vitaly.exceptions;

import com.hillel.gucul.vitaly.exception.Customer;
import com.hillel.gucul.vitaly.exception.CustomerSevice;
import com.hillel.gucul.vitaly.exception.NameNotFundException;
import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


/**
 * Created by insomnia on 16.07.17.
 */
@RunWith(HierarchicalContextRunner.class)
public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void testDibisionWithException() {
        int i = 1 / 0;
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }

    public class ExceptionTest2 {

        @Test
        public void testDivisionWithException() {
            try {
                int i = 1 / 0;
                fail();//remeber this line , else 'may' false positive
            } catch (ArithmeticException e) {
                assertThat(e.getMessage(), is ("/ by zero"));
            }
        }

        @Test
        public void testEmptyList(){
            try {
                new ArrayList<>().get(0);
                fail();
            }catch (IndexOutOfBoundsException e) {
                assertThat(e.getMessage(), is("Index: 0, Size: 0"));
                System.out.println(e.getMessage());
            }
        }


        public class ExceptionTest3 {

            @Rule
            public ExpectedException thrown = ExpectedException.none();

            @Test
            public void testDivisionWithException() {

                thrown.expect(ArithmeticException.class);
                thrown.expectMessage(containsString("/ by zero"));
                int i = 1 / 0;
            }

            @Test
            public void testNameNotFoundException() throws NameNotFundException {

                //test type
                thrown.expect(NameNotFundException.class);

                //test message
                thrown.expectMessage(is("Name is empty!"));

                //test detail
                thrown.expect(hasProperty("errCode")); //make sure getters and setters are defined
                thrown.expect(hasProperty("errCode", is(666)));

                CustomerSevice cust = new CustomerSevice();
                cust.findByName("");
            }
        }



    }













}
