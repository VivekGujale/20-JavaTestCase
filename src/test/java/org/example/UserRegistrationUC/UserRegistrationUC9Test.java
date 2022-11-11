package org.example.UserRegistrationUC;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationUC9Test {
    @Test
    public void givenEmailID_WhenValid_ThenTrue() {
        boolean result=UserRegistrationUC9.isCombinedAllMailID("abc-100@yahoo.com,");
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void givenEmailID_WhenInvalid_ThenFalse() {
        boolean result1=UserRegistrationUC9.isCombinedAllMailID("abc-100yahoo.com,");
        Assert.assertFalse(result1);
        System.out.println(result1);
    }

}