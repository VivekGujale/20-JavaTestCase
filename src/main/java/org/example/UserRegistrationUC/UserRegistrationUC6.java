package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC6 {
    public static boolean isPasswordUpperCase(String password) {
        return Pattern.matches("[A-Z][a-z]{7,}", password);

    }
}
