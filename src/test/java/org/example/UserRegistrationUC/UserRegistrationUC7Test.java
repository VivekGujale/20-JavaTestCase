package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC7Test {

    @Test
    public void givenPasswordAtLeastOneNumber_WhenValid_ThenTrue() {
        boolean result = UserRegistrationUC7.isPasswordHaveNumber("Vivekg07");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenPasswordAtLeastOneNumber_WhenInvalid_ThenFalse() {
        boolean result1 = UserRegistrationUC7.isPasswordHaveNumber("vivekg07");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }

}