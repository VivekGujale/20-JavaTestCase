package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC5 {
    public static boolean isPasswordMinEightCharacters(String password) {
        return Pattern.matches("[A-Za-z]{8,}", password);

    }
}
