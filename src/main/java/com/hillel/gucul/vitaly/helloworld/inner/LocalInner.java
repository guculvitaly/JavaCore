package com.hillel.gucul.vitaly.helloworld.inner;

/**
 * Created by insomnia on 09.07.17.
 */
public class LocalInner {

    private String message = "aleksey.com";

    public void display(){

        final int DATA = 20;

        class Local {
            void msg(){
                System.out.println(message + " : " + DATA);
            }
        }
        Local loc = new Local();
        loc.msg();
    }
}
