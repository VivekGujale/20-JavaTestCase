package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC4Test {

    @Test
    public void givenMobileNumber_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC4.isMobileNumberValidate("91 9898989898");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC4.isMobileNumberValidate("9898989898");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}