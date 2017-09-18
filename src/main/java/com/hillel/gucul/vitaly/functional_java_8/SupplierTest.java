package com.hillel.gucul.vitaly.functional_java_8;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by insomnia on 19.08.17.
 */
public class SupplierTest {

    public static void main(String[] args) {

        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 =  userFactory.get();
        User user2 = userFactory.get();

        System.out.println("user1 name: "+user1.getName());
        System.out.println("user2 name: "+user2.getName());

    }
}
