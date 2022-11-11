package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC10 {
    public static boolean isFirstNameInitialCapital(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);
    }

    public static boolean isLastNameInitialCapital(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }

    public static boolean isEmailValidate(String emailID) {
        return Pattern.matches("[abc]{3}(.?[a-z0-9]{2,})?@[bl]{2}.[a-z]{2,}(.?[a-z]{2,})?", emailID);
    }

    public static boolean isMobileNumberValidate(String mobileNumber) {
        return Pattern.matches("[91]{2}[ ][0-9]{10}", mobileNumber);
    }

    public static boolean isPasswordHaveSpecialChar(String password) {
        return Pattern.matches("[A-Z][a-z]{4,}[0-9]{1,}[!@#^%&*]", password);
    }

    public static boolean isCombinedAllMailID(String mailID) {
        return Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+", mailID);
    }
}

