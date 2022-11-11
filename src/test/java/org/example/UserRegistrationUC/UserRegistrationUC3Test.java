package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC3Test {

    @Test
    public void givenFirstName_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC3.isEmailValidate("abc@bl.co");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC3.isEmailValidate("xyz@bl.co");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}