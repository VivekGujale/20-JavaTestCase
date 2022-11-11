package org.example.UserRegistrationUC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC6Test {

    @Test
    public void givenPasswordMustUpperCharacter_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC6.isPasswordUpperCase("Vivekgujale");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenPasswordMustUpperCharacter_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC6.isPasswordUpperCase("vivekgujale");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}