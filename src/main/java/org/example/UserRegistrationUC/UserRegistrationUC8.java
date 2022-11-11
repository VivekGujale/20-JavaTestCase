package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC8 {
    public static boolean isPasswordHaveSpecialChar(String password) {
        return Pattern.matches("[A-Z][a-z]{4,}[0-9]{1,}[!@#^%&*]", password);
    }
}
