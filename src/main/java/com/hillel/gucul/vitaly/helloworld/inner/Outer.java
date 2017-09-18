package com.hillel.gucul.vitaly.helloworld.inner;

/**
 * Created by insomnia on 09.07.17.
 */
public class Outer {

    private static String textNested = "Nested String!";
    private String text = "I am private";

    public static class  Nested {

        public void printNestedText(){
            System.out.println(textNested);
        }
    }

    public class Inner {

        private String text = "I am Inner private";

        public void printText (){
            System.out.println(text);
            System.out.println(Outer.this.text);
        }

    }

    public void test(){

    }

    /**
     * local class
     */
    public void local(){
        class Local {
            Local local = new Local();
        }
    }

    public void doIt(){
        System.out.println("OuterClass doIt()");
    }



}