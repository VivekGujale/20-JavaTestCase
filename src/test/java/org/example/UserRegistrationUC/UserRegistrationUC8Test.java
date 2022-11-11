package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC8Test {
    @Test
    public void givenPasswordOnlyOneSpecialCharacter_WhenvalidValid_ThenTrue() {
        boolean result=UserRegistrationUC8.isPasswordHaveSpecialChar("Vivekg07@");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenPasswordOnlyOneSpecialCharacter_WhenInvalidValid_ThenFalse() {
        boolean result1=UserRegistrationUC8.isPasswordHaveSpecialChar("vivekg07@");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }

}