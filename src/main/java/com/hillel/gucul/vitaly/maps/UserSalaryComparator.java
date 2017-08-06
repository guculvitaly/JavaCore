package com.hillel.gucul.vitaly.maps;

import java.util.Comparator;

/**
 * Created by insomnia on 06.08.17.
 */
public class UserSalaryComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        if (user1.getSalary() >= user2.getSalary()) {
            return 1;
        }else {
            return -1;
        }
    }

}
