package com.hillel.gucul.vitaly.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by insomnia on 01.09.17.
 */
public class UsernameValidator {

    private Pattern pattern;
    private Matcher matcher;

    /**
     *  ^ - Start of the line
     *  [a-z0-9_-] - Match characters and symbols in the list, a-z, 0-9, underscore, hyphen
     *  {3,15} - Length at least 3 characters and maximum length of 15
     *  $ - End of the line
     */


    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    public UsernameValidator() {
        pattern = Pattern.compile(USERNAME_PATTERN);
    }

    /**
     * Validate username
     */
    public boolean validate(String username){
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
