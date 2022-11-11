package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC9 {
    public static boolean isCombinedAllMailID(String mailID) {
        return Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+", mailID);
    }
}
