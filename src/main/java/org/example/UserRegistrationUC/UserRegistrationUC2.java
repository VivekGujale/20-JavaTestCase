package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC2 {
    public static boolean isLastNameInitialCapital(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }
}
