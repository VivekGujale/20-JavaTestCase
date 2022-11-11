package org.example.UserRegistrationUC;

import java.util.regex.Pattern;


public class UserRegistrationUC1 {

    public static boolean isFirstNameInitialCapital(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);
    }
}

