package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC4 {
    public static boolean isMobileNumberValidate(String mobileNumber) {
        return Pattern.matches("[91]{2}[ ][0-9]{10}", mobileNumber);
    }
}
