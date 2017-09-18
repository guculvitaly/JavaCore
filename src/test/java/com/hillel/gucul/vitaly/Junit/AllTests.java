package com.hillel.gucul.vitaly.Junit;

/**
 * Created by insomnia on 14.07.17.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CalculatorTest2.class})
public class AllTests{

}