package com.hillel.gucul.vitaly.regex;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by insomnia on 01.09.17.
 */
public class UsernameValidatorTest {

    private UsernameValidator usernameValidator;

    @BeforeClass
    public void initData(){
        usernameValidator = new UsernameValidator();
    }

    @DataProvider
    public Object[][] ValidUsernameProvider(){
        return new Object[][]{{new String[] {"alex34", "alex_2002", "alex-2002", "alex3-4_good"}}};
    }

    @DataProvider
    public Object[][] InvalidUsernameProvider() {
        return new Object[][]{{new String[]{"al", "al@elksey", "alekey123456789_-"}}
        };
    }

    @Test(dataProvider = "ValidUsernameProvider")
    public void ValidUsernameTest(String [] Username){

        for (String temp: Username) {
            boolean valid = usernameValidator.validate(temp);
            System.out.println("Username is valid : " + temp + " , " + valid);
            Assert.assertEquals(true, valid);
        }
    }

    @Test(dataProvider = "InvalidUsernameProvider",
    dependsOnMethods = "ValidUsernameTest")
    public void InvalidUsernameTest(String [] Username) {

        for (String temp: Username) {
            boolean valid = usernameValidator.validate(temp);
            System.out.println("username is valid : " + temp+ " , " + valid);
            Assert.assertEquals(false, valid);
        }
    }
}
