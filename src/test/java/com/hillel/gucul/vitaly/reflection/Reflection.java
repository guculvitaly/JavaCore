package com.hillel.gucul.vitaly.reflection;

import com.hillel.gucul.vitaly.annotations.People;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by insomnia on 23.07.17.
 */
public class Reflection {

    @Test
    public  void reflection(){

        People people = new People();
        Class myClass = people.getClass();

        Class mySecondClass = People.class;

        System.out.println(Arrays.toString(people.getClass().getFields()));
        System.out.println(people.getClass().getModifiers());
        System.out.println(Arrays.toString(people.getClass().getMethods()));

        Package pack = people.getClass().getPackage();
        System.out.println(pack.getName());

        Class[] interfaces = myClass.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(i == 0 ? " implements " : ", ");
            System.out.println(interfaces[i].getSimpleName());

        }
        System.out.println(" {");

        Field[] fields = myClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\t" + field.getModifiers() + " "
            + field.getType() + " " + field.getName() + ";");

        }

        Method[] methods = myClass.getDeclaredMethods();
        for(Method m : methods ) {System.out.println();
            Annotation[] annotations = m.getAnnotations();
            System.out.println("\t");
            for (Annotation a : annotations) {
                System.out.print("@" + a.annotationType().getSimpleName() + " ");

            }
            //System.out.println();
            System.out.print("\t" + m.getModifiers() + " " + m.getReturnType() + " " + m.getName() + ";");
        }
    }


}
