package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

public class UserRegistrationUC3 {
    public static boolean isEmailValidate(String emailID) {
        return Pattern.matches("[abc]{3}(.?[a-z0-9]{2,})?@[bl]{2}.[a-z]{2,}(.?[a-z]{2,})?", emailID);
    }
}
