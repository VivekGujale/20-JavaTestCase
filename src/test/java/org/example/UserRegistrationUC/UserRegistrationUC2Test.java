package org.example.UserRegistrationUC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC2Test {

    @Test
    public void givenLastName_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC2.isLastNameInitialCapital("Gujale");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC2.isLastNameInitialCapital("gujale");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }
}