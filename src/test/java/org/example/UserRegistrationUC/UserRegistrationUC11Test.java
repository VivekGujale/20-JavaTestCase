package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC11Test {
    @Test
    public void givenEmailID_WhenValid_ThenTrue() {
        Assert.assertTrue(UserRegistrationUC11.validateForMultipleMailID("abc100@yahoo.com,"));
        Assert.assertTrue(UserRegistrationUC11.validateForMultipleMailID("xyz@gmail.com,"));
        Assert.assertTrue(UserRegistrationUC11.validateForMultipleMailID("100-@xyz.com,"));
        Assert.assertTrue(UserRegistrationUC11.validateForMultipleMailID("56abc@abc.com,"));
        Assert.assertTrue(UserRegistrationUC11.validateForMultipleMailID("lmn@yahoo.com.in"));
    }

    @Test
    public void givenEmailID_WhenInvalid_ThenFalse() {
        Assert.assertFalse(UserRegistrationUC11.validateForMultipleMailID("abc-100yahoo.com,"));
        Assert.assertFalse(UserRegistrationUC11.validateForMultipleMailID("xyzgmail.com,"));
        Assert.assertFalse(UserRegistrationUC11.validateForMultipleMailID("100-xyz.com,@"));
        Assert.assertFalse(UserRegistrationUC11.validateForMultipleMailID("56abcabc.com,"));
        Assert.assertFalse(UserRegistrationUC11.validateForMultipleMailID("lmnyahoo.com.in"));
    }
}