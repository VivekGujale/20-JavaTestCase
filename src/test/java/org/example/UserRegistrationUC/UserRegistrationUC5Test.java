package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC5Test {
    @Test
    public void givenPasswordMinEightCharacters_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC5.isPasswordMinEightCharacters("vivekGujale");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenPasswordMinEightCharacters_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC5.isPasswordMinEightCharacters("vivekujale07");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}