package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC7 {
    public static boolean isPasswordHaveNumber(String password) {
        return Pattern.matches("[A-Z][a-z]{5,}[0-9]{1,}", password);

    }
}
