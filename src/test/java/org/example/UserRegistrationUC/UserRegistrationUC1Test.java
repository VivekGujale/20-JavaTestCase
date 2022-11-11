package org.example.UserRegistrationUC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC1Test {

    @Test
    public void givenFirstName_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC1.isFirstNameInitialCapital("Vivek");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC1.isFirstNameInitialCapital("vivek");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}
