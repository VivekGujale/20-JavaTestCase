package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC10Test {
    @Test
    public void _givenUserDetailsWhenValid_ThenHappy() {
        Assert.assertTrue(UserRegistrationUC10.isFirstNameInitialCapital("Vivek"));
        Assert.assertTrue(UserRegistrationUC10.isLastNameInitialCapital("Gujale"));
        Assert.assertTrue(UserRegistrationUC10.isEmailValidate("abc@bl.co"));
        Assert.assertTrue(UserRegistrationUC4.isMobileNumberValidate("91 9898989898"));
        Assert.assertTrue(UserRegistrationUC10.isPasswordHaveSpecialChar("Vivekg07@"));
        Assert.assertTrue(UserRegistrationUC10.isCombinedAllMailID("abc-100@yahoo.com,"));
    }

    @Test
    public void givenUserDetails_WhenInvalid_ThenSad() {
        Assert.assertFalse(UserRegistrationUC10.isFirstNameInitialCapital("vivek"));
        Assert.assertFalse(UserRegistrationUC10.isLastNameInitialCapital("gujale"));
        Assert.assertFalse(UserRegistrationUC10.isEmailValidate("xyz@bl.co"));
        Assert.assertFalse(UserRegistrationUC10.isMobileNumberValidate("9898989898"));
        Assert.assertFalse(UserRegistrationUC8.isPasswordHaveSpecialChar("vivekg07@"));
        Assert.assertFalse(UserRegistrationUC10.isCombinedAllMailID("abc-100yahoo.com,"));
    }
}