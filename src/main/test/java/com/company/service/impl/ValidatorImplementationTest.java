package com.company.service.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidatorImplementationTest {

    @Test
    public void testValidate() {
        ValidatorImplementation vld=new ValidatorImplementation();
        String str="12 14";
        boolean actual=vld.Validate(str);
        boolean expected=true;
        assertEquals(actual,expected);
    }
}