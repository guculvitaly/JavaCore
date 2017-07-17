package com.hillel.gucul.vitaly.inner;

import com.hillel.gucul.vitaly.helloworld.inner.LocalInner;
import com.hillel.gucul.vitaly.helloworld.inner.MyInterface;
import com.hillel.gucul.vitaly.helloworld.inner.Outer;
import org.junit.Test;

/**
 * Created by insomnia on 09.07.17.
 */
public class OuterTets {

    @Test
    public void outerTest(){

        Outer.Nested nested = new Outer.Nested();

        nested.printNestedText();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printText();
        outer.doIt();

        Outer outer1 = new Outer(){
            @Override
            public void doIt(){
                System.out.println("Anonymous class doIt()");
            }
        };

        outer1.doIt();

    }

    @Test
    public void myIntTest(){

        final String TEXT_TO_PRINT = "Text....";

        MyInterface myInterface = new MyInterface() {

            private String text;


            // block  initializer
            {this.text = TEXT_TO_PRINT;}


            @Override
            public void doIt() {
                System.out.println("Anonymous class doIt()");
                System.out.println(this.text);
                this.text = ";";
            }
        };

        myInterface.doIt();

    }




    @Test
    public void cacheTest(){

        String key = "Password";
        Integer pass = 1567888;

        Cache cache = new Cache();
        cache.store(key, pass);

        System.out.println(cache.get("Password"));
        System.out.println(cache.getData("Password"));
    }

    @Test
    public void local () {
        LocalInner obj = new LocalInner();
        obj.display();
    }




}
