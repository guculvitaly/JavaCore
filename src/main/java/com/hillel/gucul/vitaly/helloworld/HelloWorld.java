package com.hillel.gucul.vitaly.helloworld;
import static java.lang.System.out;


/**
 * Created by insomnia on 18.06.17.
 */

/**
 * make by me
 */
public class HelloWorld {
   protected HelloWorld(){}

   public static <T> void print(T t) {
      out.print(t);
   }

   /**
    * println with Object
    * @param object
    */
   public static void println(Object object) {

      out.println(object);
   }

   /**
    * println
    */
   public static void prinln() {

      out.println();
   }


}
