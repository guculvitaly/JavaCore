package com.hillel.gucul.vitaly.annotations;

import java.lang.annotation.*;

/**
 * Created by insomnia on 23.07.17.
 */
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
@Inherited
public @interface MyNewComponent {

    String value();

    String name();
    String age();
    String[] newNames();
    String element() default "elem";
}
