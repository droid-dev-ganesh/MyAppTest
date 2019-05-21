package com.example.myapptest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class UtilsTest {


    @Test
    public void testIsEmailValid() {
        String testEmail = "ganesh@gmail.com";
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), Utils.checkEmailForValidity(testEmail), is(true));
    }

}